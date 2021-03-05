import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        /*
        Vamos atualizar o salário de um vendedor
         */

        Connection connection = null;
        Statement st = null;

        try {

            connection = DB.getConnection();

            connection.setAutoCommit(false); // Comando 1 para resolver o problema da integridade (Vide explicação abaixo.)
            /*
            O comando acima exige que o programador confirme a operação. Não há confirmação automática.
             */

            st = connection.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            /*
              Aqui no meio do caminho simularemos uma falha no sistema
             */

            // Já vimos que o erro funciona. Vou comentar o Fake error para fazer a plicação funcionar.
            //  Se quiser ver a falha novamente, descomente as linhas abaixo.

            //int x = 1;

            //if (x < 2) {

            //    throw new SQLException("Fake error");
                /* Do jeito que está, o comando em 'int rows1 = ...' será executado, mas o 'int rows2 = ...' não.
                A isso damos o nome de falha de integridade do banco de dados.
                Para resolver, "encapsularemos" esses comandos dentro de uma transação usando dois comandos.
                 */

            //}

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();  // Comando 2 para resolver o problema da integridade (Vide explicação acima.)

            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);

        }
        catch (SQLException e) {

            //e.printStackTrace();

            // Para tratar a exceção advinda da falha de intetridade acima:

            try {
                connection.rollback(); // Esse comando volta a transação para o que era antes do primeiro comando.
                throw new DbException("Transaction rolled back. Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                // Aqui veremos um problema sério se o roll back falhar
                throw new DbException("Error trying to rolled back. Caused by: " + e1.getMessage());
            }
        }
        finally {

            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
