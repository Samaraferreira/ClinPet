/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Cliente;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Família
 */
public class clienteDao {

    public void salvar(Cliente c) {

        String sql = "INSERT INTO cliente (id_Cliente, nome, email, cpf, senha, cidade, estado) VALUES (?,?,?,?,?,?,?)";

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setString(2, c.getNome());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getSenha());
            pst.setString(6, c.getCidade());
            pst.setString(7, c.getEstado());
            pst.execute();
                      
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Cliente consultarEmail(String email) {

        String sql = "SELECT * FROM cliente WHERE email=?";
        Cliente c = new Cliente();

        try {
            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID_CLIENTE");
                String nome = rs.getString("NOME");
                String cpf = rs.getString("CPF");
                String cidade = rs.getString("CIDADE");
                String estado = rs.getString("ESTADO");

                c = new Cliente(id, nome, email, cpf, cidade, estado);
                atualizarLogged(c);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return c;
    }
    
    public void atualizarLogged(Cliente c) {
        String sql = "UPDATE logged SET ID_CLIENTE=?, NOME=?, EMAIL=?, CPF=?, CIDADE=?, ESTADO=? WHERE IDLOG=3";
        
        try {
            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, c.getId());
            pst.setString(2, c.getNome());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getCidade());
            pst.setString(6, c.getEstado());
            pst.executeUpdate();

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> read() {

        String sql = "SELECT * FROM cliente";

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
    
    public boolean checarlogin(String email, String senha) {

        String sql = "SELECT * FROM cliente where email = ? and senha=?";
        Cliente c = new Cliente();
        ResultSet rs = null;
        boolean checar = false;
        
        try {
            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
                
            pst.setString(1, email);
            pst.setString(2, senha);
            
            rs = pst.executeQuery();

            if (rs.next()) {
                checar = true;
                c.setId(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setEmail(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setSenha(rs.getString(5));
                c.setCidade(rs.getString(6));
                c.setEstado(rs.getString(7));
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return checar;
    }
   
//    public void excluir(int id) {
//
//        String sql = "DELETE FROM usuario WHERE id=?";
//
//        try {
//            Connection conn = ConnectionFactory.getConnection();
//            PreparedStatement pst = conn.prepareStatement(sql);
//
//            pst.setInt(1, id);
//            pst.execute();
//
//            pst.close();
//            conn.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//             ex.printStackTrace();
//        }
//    }
}
