import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;  // Faço a conexão
        Statement st = null;  // Faço uma consulta à base
        ResultSet rs = null;  // Guardo o resultado da consulta aqui

        System.out.println();

        try {

            connection = DB.getConnection(); // Conectado!

            st = connection.createStatement(); // Base consultada!
            rs = st.executeQuery("select * from department");  // Consulta repassada!

            while (rs.next()) {

                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            // rs.close();
            // st.close();

            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();

            /*
            rs.close() e st.close() podem lançar exceções também. Para evitar
            ficar fazendo try-catch, vou atualizar a classe DB com métodos auxiliares
            para fazer essa tarefa para mim (ver DB.java ao final).
             */
        }


    }
}
