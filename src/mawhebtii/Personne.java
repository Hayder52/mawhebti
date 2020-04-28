/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawhebtii;

import java.util.Objects;

/**
 *
 * @author bureau
 */
public class Personne {
    private int id;
    private String prenom;
    private String nom;
    private int numtelephone ;
    private String adresse;

    public Personne(int id, String prenom, String nom, int numtelephone, String adresse) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.numtelephone = numtelephone;
        this.adresse = adresse;
    }

   
    
    public Personne(){
        
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getNumtelephone() {
        return numtelephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumtelephone(int numtelephone) {
        this.numtelephone = numtelephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.prenom);
        hash = 67 * hash + Objects.hashCode(this.nom);
        hash = 67 * hash + this.numtelephone;
        hash = 67 * hash + Objects.hashCode(this.adresse);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numtelephone != other.numtelephone) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", numtelephone=" + numtelephone + ", adresse=" + adresse + '}';
    }
    
}
