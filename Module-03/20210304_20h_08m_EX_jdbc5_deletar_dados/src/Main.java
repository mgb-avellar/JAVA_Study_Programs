import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        /*
        Vamos atualizar o salário de um vendedor
         */

        Connection connection = null;
        PreparedStatement st = null;

        try {

            connection = DB.getConnection();

            st = connection.prepareStatement(
                    "delete from department "
                    + "where "
                    + "Id = ?"
            );

           //st.setInt(1, 5);

             st.setInt(1, 2);  // Isso aqui dá erro de referência, pois existem vendedores que
                                 //   ficarão sem referência de departamento

            int rowsAffected = st.executeUpdate();
            System.out.println();
            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            //e.printStackTrace();
            throw new DbIntegrityException(e.getMessage());
        }
        finally {

            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
