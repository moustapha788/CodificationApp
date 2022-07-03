package models;

import java.util.Date;

public class NonLoge  extends Boursier{
    
 

   
    /**
     * @param nom
     * @param prenom
     * @param etat
     * @param matricule
     * @param email
     * @param dateDeNaissance
     * @param telephone
     * @param adresse
     * @param montantBourse
     */
    public NonLoge( String nom, String prenom, int etat, String matricule, String email, Date dateDeNaissance,
            String telephone, String adresse, int montantBourse) {
        super(nom, prenom, etat, matricule, email, dateDeNaissance, telephone, adresse, montantBourse);
    }

    @Override
    public String toString() {
        return "NonLoge []\n";
    }
}
