/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livecoding_28_mar_2018;

import java.util.List;
/**
 *
 * @author p1705387
 */
public class ListeContact {
    
    private List<Contact> l;
    
    public ListeContact(){
        l = new ArrayList<>();
    }
    
    public void ajouter(Contact c) throws ContactDejaPresent{
        if(!l.contains(c)) l.add(c);
        else throw new ContactDejaPresent(c.toString());
    }
    public void supprimer(int id) throws ContactInexistant{
        for(Contact c : l)
            if(c.getIdentifiant() == id){
                
            }
        
        throw new ContactInexistant("Contact d'identifiat " + id);
    }
    @Override
    public String toString(){
        
    }
}


class ContactDejaPresent extends Exception{
    public ContactDejaPresent(String s){
        super();
    }
}

class ContactInexistant extends Exception{
    public ContactInexistant(String s){
        super();
    }
}