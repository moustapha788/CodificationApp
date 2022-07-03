package models;

import java.util.Date;

public class NonBoursier extends Etudiant {

    /**
     * @param nom
     * @param prenom
     * @param etat
     * @param matricule
     * @param email
     * @param dateDeNaissance
     * @param telephone
     * @param adresse
     */
    public NonBoursier( String nom, String prenom, int etat, String matricule, String email,
            Date dateDeNaissance, String telephone, String adresse) {
        super(nom, prenom, etat, matricule, email, dateDeNaissance, telephone, adresse);
    }

    @Override
    public String toString() {
        return "NonBoursier []\n";
    }

}
