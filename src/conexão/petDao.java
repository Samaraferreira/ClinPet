/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Samara
 */
public class petDao {
        public void salvar(Animal c) {

        String sql = "INSERT INTO animal (id_Animal, id_Cliente, nome, tipo, raca, peso, sexo, idade) VALUES (?,?,?,?,?,?,?,?)";

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setInt(2, c.getIdCliente());
            pst.setString(3, c.getNome());
            pst.setString(4, c.getTipo());
            pst.setString(5, c.getRaca());
            pst.setFloat(6, c.getPeso());
            pst.setString(7, c.getSexo());
            pst.setInt(8, c.getIdade());
            pst.execute();
                      
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Animal> read() {

        String sql = "SELECT * FROM animal";

        ArrayList<Animal> lista = new ArrayList<Animal>();
        Animal c = new Animal();

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String raca = rs.getString("RACA");
                String sexo = rs.getString("SEXO");
                float peso = rs.getFloat("PESO");
                int idade = rs.getInt("IDADE");

                lista.add(new Animal(nome, tipo, raca, sexo, peso, idade));
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
