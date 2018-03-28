/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livecoding_28_mar_2018;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author p1705387
 */

   
public class Contact {
    private String nom;
    private String prenom;
    private int numTel;
    private Date dateCreationContact;
    private static int identifiant;
    
    
    // Constructeur non paramétré
    
    public Contact () {
        nom = "nom";
        prenom = "prenom";
        numTel = 0011223344;
        identifiant = 0;
        dateCreationContact = localDate;
    }
    
    // Constructeur paramétré
    
    public Contact (String nom, String prenom, int numTel){
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }
    
    // getters
    
    public String getNom() {return nom ;}
    public String getPrenom() {return prenom ;}
    public int getNum() {return numTel ;}
    public int getId() {return identifiant ;}
    
    
    // setters
    
    public void setNom (String newNom) { nom = newNom; }
    public void setNumber (int newNum) { numTel = newNum; }
    
    // methode equals
    @Override
    public boolean equals(Object autre){
        if(this==autre)
                return true;
        if(autre==null)
                return false;
        if(this.getClass() != autre.getClass())
            return false;
        Contact c = (Contact) autre;
        
        return  Objects.equals(this.nom, c.nom) &&
                Objects.equals(this.prenom, c.prenom) &&
                Objects.equals(this.numTel, c.numTel);
    }
    
    
    
}

