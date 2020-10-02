/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão;

import Classes.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Samara
 */

public class exameDAO {
    public void salvar(Exame c) {

        String sql = "INSERT INTO exame (id_Exame, id_Cliente, Animal, datta, nome,  horario, valor) VALUES (?,?,?,?,?,?,?)";

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setInt(2, c.getIdCliente());
            pst.setString(3, c.getAnimal());
            pst.setString(4, c.getData());
            pst.setString(5, c.getNome());
            pst.setString(6, c.getHorario());
            pst.setFloat(7, c.getValor());
            pst.execute();
                      
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Exame> read() {

        String sql = "SELECT * FROM Exame";

        ArrayList<Exame> lista = new ArrayList<Exame>();
        Exame c = new Exame();

        try {

            Connection conn = ConnectionFactory1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id_Exame = rs.getInt("ID_EXAME");
                int id_Cliente = rs.getInt("ID_CLIENTE");
                String Animal = rs.getString("ANIMAL");
                String nome = rs.getString("NOME");
                String data = rs.getString("DATTA");
                String horario = rs.getString("HORARIO");
                float valor = rs.getFloat("VALOR");
                
                lista.add(new Exame(id_Exame, id_Cliente, Animal, nome, data, horario, valor));
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
