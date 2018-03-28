/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livecoding_28_mar_2018;

/**
 *
 * @author p1705387
 */
public class Client extends Contact{
    private int cAffaires;
    
    public Client (String nom, String prenom, int numTel, int cAffaires) {
        super(nom, prenom, numTel);
        this.cAffaires = cAffaires;
    }
    
    public int getCA() { return cAffaires; }
    
    public void setCA(int newCA) { newCA = cAffaires; }
    
}
