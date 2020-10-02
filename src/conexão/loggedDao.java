/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Samara
 */
public class loggedDao {
    public ArrayList<Cliente> read() {

        String sql = "SELECT * FROM logged";

        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Cliente c = new Cliente();

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID_CLIENTE");
                String nome = rs.getString("NOME");
                String email = rs.getString("EMAIL");
                String cpf = rs.getString("CPF");
                String cidade = rs.getString("CIDADE");
                String estado = rs.getString("ESTADO");

                lista.add(new Cliente(id, nome, email, cpf, cidade, estado));
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return lista;
    }
    public int id() {

        String sql = "SELECT id_Cliente FROM logged";

        Cliente c = new Cliente();
        int id =0;
        
        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getInt("ID_CLIENTE");
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return id;
    }
}
