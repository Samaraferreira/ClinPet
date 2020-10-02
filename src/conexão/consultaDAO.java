/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Samara
 */
public class consultaDAO {
        public void salvar(Consulta c) {

        String sql = "INSERT INTO consulta2 (id_consulta, id_Cliente, nomeVet, nomeAnimal, datta, horario, valor) VALUES (?,?,?,?,?,?,?)";

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setInt(2, c.getIdCliente());
            pst.setString(3, c.getNomeVet());
            pst.setString(4, c.getNomePet());
            pst.setString(5, c.getData());
            pst.setString(6, c.getHorario());
            pst.setFloat(7, c.getValor());
            pst.execute();
                      
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Consulta> read() {

        String sql = "SELECT * FROM consulta2";

        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        Consulta c = new Consulta();

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id_consulta = rs.getInt("ID_CONSULTA");
                int idCliente = rs.getInt("ID_CLIENTE");
                String nome = rs.getString("NOMEVET");
                String pet = rs.getString("NOMEANIMAL");
                String data = rs.getString("DATTA");
                String horario = rs.getString("HORARIO");
                float valor = rs.getFloat("VALOR");
                
                lista.add(new Consulta(id_consulta, idCliente, nome, pet, data, horario, valor));
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
