package repository;


    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.bien;
import entities.zone;


public class bienrepository {
    public void insert(bien bien){
        
    }
     public List<bien> selectAll(){
         List<bien> biens=new ArrayList<>();
          try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoiriage" 
                   , "root", "");
             Statement statement = conn.createStatement();
             String sql="SELECT * FROM `bien` b, zone zn  WHERE b.zone_id=zn.id_zone;";
             ResultSet rs=statement.executeQuery(sql);
            while (rs.next()) {

                zone zone=new zone();
                zone.setId(rs.getInt("id_zone"));
                zone.setNomzone(rs.getString("nom_zone"));

            }
            statement.close();
            rs.close();
            conn.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Erreur de chargement de Driver");
       }
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
       return  biens;
      }
}

