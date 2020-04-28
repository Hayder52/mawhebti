/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawhebtii;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.activation.DataSource;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bureau
 */
public class CommentairesService {
        
    private static CommentairesService instance;
    public static CommentairesService getInstance() throws SQLException {
       
         if (instance == null) {
            instance = new CommentairesService();
        }
        return instance;
    }
 
    public Statement ste;
Connection con;
    public CommentairesService() throws SQLException {
       ste = (Statement) con.createStatement();
    }
    
    
     public boolean ajouterCommentaire(Commentaire r) throws SQLException{
       String requete = "INSERT INTO commentaire( id, contenu,date) VALUES (?,?,?) ";
        Commentaire a =new Commentaire();
        Abonne p=Session.getLoggedInUser();
        Userservice us= new Userservice();
     
           try {
            PreparedStatement pst =con.prepareStatement(requete);
            pst.setInt(1,a.getId());
            pst.setString(2,a.getContenu());
            pst.setDate(3, (Date) a.getDate());
             pst.executeUpdate();
            System.out.println("ajout commentaires reussit");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            return false;
    }
       public void SupprimerCommentaire(int i)
{
  String requete="DELETE FROM commentaires WHERE id='"+i+"' ";     
        Statement st;
        try {
            st = (Statement) con.createStatement(); 
            st.executeUpdate(requete);
      System.out.println("comm supprimé");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
       public boolean ModifierComm(Commentaire r)
    {
        int nbr_ligne;
         Commentaire a =new Commentaire();
        try{
            
            String requete="UPDATE commentaires set id=?, contenu=?,date=?  WHERE id="+r.getId()+"";
            PreparedStatement pst = con.prepareStatement(requete);
           pst.setInt(1,a.getId());
            pst.setString(2,a.getContenu());
            pst.setDate(3, (Date) a.getDate());
           
            
          
            
            nbr_ligne=pst.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        if(nbr_ligne == 0){
            return false;
        }else{
            return true;
        }
        
    }
      public List<Commentaire> ListerCommentaires(String i){
         List<Commentaire> listCom = new ArrayList<>();
        Commentaire listForm= new Commentaire();
        try {  
            String requete = "SELECT * FROM commentaire WHERE id='"+i+"'";

           
            ResultSet rs = ste.executeQuery(requete);

             while(rs.next()){
                
                 listForm.setId(rs.getInt("id"));
              
                 listForm.setDate(rs.getDate("date"));
                 listForm.setContenu(rs.getString("contenu"));
                 
                 listCom.add(listForm);
                 
            }
             
        } catch (SQLException ex) {
System.out.println(ex.getMessage());        }
        return listCom;
    
    }
       public ResultSet RechercherComByImm(String i)
    {
        ResultSet rs=null;
        String requete = "SELECT * FROM commentaires WHERE id ='"+i+"'";
        try {
            rs = ste.executeQuery(requete);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs ;

       
    }
     
     }

