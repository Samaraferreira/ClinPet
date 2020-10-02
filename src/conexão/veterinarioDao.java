/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Veterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Samara
 */
public class veterinarioDao {
    public void salvar(Veterinario c) {

        String sql = "INSERT INTO veterinario (crmv, nome, email, cpf, especialidade) VALUES (?,?,?,?,?)";

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, c.getCrmv());
            pst.setString(2, c.getNome());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getEspecialidade());
            pst.execute();
                      
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Veterinario> read() {

        String sql = "SELECT * FROM veterinario";

        ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
        Veterinario c = new Veterinario();

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String crmv = rs.getString("CRMV");
                String nome = rs.getString("NOME");
                String email = rs.getString("EMAIL");
                String cpf = rs.getString("CPF");
                String especialidade = rs.getString("ESPECIALIDADE");

                lista.add(new Veterinario(crmv, nome, email, cpf, especialidade));
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
}
