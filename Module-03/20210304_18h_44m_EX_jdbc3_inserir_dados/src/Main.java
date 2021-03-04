import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        /*
        Nossa base de dados, na tabela Seller, existem seis vendedores.
        Vamos inserir mais um.

        Essa primeira parte é a "Inserção simples com preparedStatement".
        Faremos uma v2 com "Inserção com recuperação de Id" (ver versionamento no GitHub)
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;  // Faço a conexão
        PreparedStatement st = null;

        try {

            connection = DB.getConnection();

            st = connection.prepareStatement(
                    "INSERT INTO seller "
                        + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"   // preencho com os campos de dados dos vendedores, exceto o ID
                        + "VALUES "
                        + "(?, ?, ?, ?, ?)"  // Essas interrogações marcam place holders, para preenchimento posterior
                                             //   e correspondem aos campos acima
            ); // Este é meu comando SQL preparado

            // Coloco agora Carl Black na primeira interrogação ...
            st.setString(1, "Carl Black");
            //   ... email na segunda ...
            st.setString(2, "carl@gmail.com");
            //   ... data na terceira (NOTE A INSTANCIAÇÃO DIFERENTE!! NOTE QUE O DATE É DO SQL, NÃO DO UTILS!)
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()) );
            //   ... o salário na quarta ...
            st.setDouble(4, 3000.00);
            //   ... o Id do departamento dele
            st.setInt(5, 4);

            // Agora preciso executar os updates acima:

            int rowsAffected =  st.executeUpdate(); // Esse comando retorna o número de linhas alteradas.

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {

            e.printStackTrace();
        }
        catch (ParseException e) {

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
