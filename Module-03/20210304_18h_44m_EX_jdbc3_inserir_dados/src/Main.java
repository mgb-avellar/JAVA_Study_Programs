import db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        /*
        Nossa base de dados, na tabela Seller, existem seis vendedores.
        Vamos inserir mais um.

        Essa primeira parte é a "Inserção simples com preparedStatement".
        Faremos uma v2 com "Inserção com recuperação de Id" (ver versionamento no GitHub)
        Essa segunda versão é como se inseríssemos um novo valor e retornássemos o ID
        Essa é uma v2 com uma modificação para inserir dois departamentos recuperando os ids
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;  // Faço a conexão
        PreparedStatement st = null;

        try {

            connection = DB.getConnection();

            st = connection.prepareStatement(
                    "insert into department (Name) values ('Tools'),('Decor')",
                    Statement.RETURN_GENERATED_KEYS);

            // Agora preciso executar os updates acima:

            int rowsAffected =  st.executeUpdate(); // Esse comando retorna o número de linhas alteradas.

            if (rowsAffected > 0) {

                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {

                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rows affected.");
            }
        }
        catch (SQLException e) {

            e.printStackTrace();
        }
        finally {

            DB.closeStatement(st);
            DB.closeConnection();

            /*
            A conexão é sempre fechada por último.
             */
        }




    }
}
