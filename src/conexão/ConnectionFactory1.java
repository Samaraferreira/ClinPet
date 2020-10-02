/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*; // importando pacote de linguagem sql

/**
 *
 * @author Família
 */
public class ConnectionFactory1 {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
            final String driver = "com.mysql.cj.jdbc.Driver";  
            final String url = "jdbc:mysql://localhost:3306/clinpet?useTimezone=true&serverTimezone=UTC";

            String usuario = "root";
            String senha = "olindina";
            
            Class.forName(driver);
            System.out.println("carregou o driver");

            return DriverManager.getConnection(url, usuario, senha);
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionFactory1.getConnection();
    }
}
