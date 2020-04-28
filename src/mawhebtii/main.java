/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawhebtii;

/**
 *
 * @author bureau
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Myconnection mc = Myconnection.getInstance();
        Myconnection mc2 = Myconnection.getInstance();
        System.out.println(mc.hashCode()+ " -- "+mc2.hashCode());
       PersonneCrud pc = new PersonneCrud();
      pc.ajouterPersonne();
     Personne p=new  Personne(23,"hamza","sarraj",345,"manouba");
      pc.ajouterPersonne2(p);
     
    }
    
}
