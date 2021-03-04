import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        /*
        Nossa base de dados, na tabela Seller, existem seis vendedores.
        Vamos inserir mais um.

        Essa primeira parte é a "Inserção simples com preparedStatement".
        Faremos uma v2 com "Inserção com recuperação de Id" (ver versionamento no GitHub)
        Essa segunda versão é como se inseríssemos um novo valor e retornássemos o ID
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
                        + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS   // Para a segunda versão, veja o novo parâmetro (note a vírgula acima)

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
