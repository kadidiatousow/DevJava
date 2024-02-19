package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.zone;

public class zonerepository {
    public List<zone> selectAll(){
        List<zone> zone= new ArrayList<>();
        try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/devoiriage", "root", "");
            
        
            Statement statement = conn.createStatement();
         ResultSet rs=   statement.executeQuery("select * from zone");
            while (rs.next()) {
              
                zone zn=new zone();
                zn.setId(rs.getInt("id_zone"));
                zn.setNomzone(rs.getString("nom_zone"));
                zone.add(zn);
            }
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            //SQLException
            System.out.println("Erreur de chargement de Driver");
        }
        catch (SQLException e) {
            //SQLException
            System.out.println("Erreur de Connexion a la BD");
           
        }
        return zone;
    }
    
}
