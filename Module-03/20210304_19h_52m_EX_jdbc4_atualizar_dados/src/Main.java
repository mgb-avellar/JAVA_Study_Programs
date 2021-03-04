import db.DB;

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
                    "update seller "
                         + "set BaseSalary = BaseSalary + ? "
                         + "where "
                         + "(DepartmentId = ?)"
            );

            st.setDouble(1, 227.89);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println();
            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
