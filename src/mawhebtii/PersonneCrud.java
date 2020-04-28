/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawhebtii;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bureau
 */
public class PersonneCrud {
     Connection cnx;
     
    
    public PersonneCrud() {
        cnx = Myconnection.getInstance().getCnx();
    }
    
    public void ajouterPersonne(){
           
         try {
             String requete = "INSERT INTO personne(nom,prenom)"
                     + "VALUES ('Tounsi','Rami')";
             java.sql.Statement st=cnx.createStatement();
             st.executeUpdate(requete);
             
             System.out.println("Personne ajoutée!");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());         }
           
    }
    
    public void ajouterPersonne2(Personne p){
            try {
                String requete2 = "INSERT INTO personne (id,prenom,nom,numtelephone,adresse)"
                        + "VALUES (?,?,?,?,?)";
                PreparedStatement pst = cnx.prepareStatement(requete2);
               pst.setInt(1,p.getId());
                pst.setString(2, p.getPrenom());
                pst.setString(3, p.getNom());
                pst.setString(4, p.getAdresse());
                pst.executeUpdate();
                System.out.println("Person added!");
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
          
    }
    
  
   
    
}
