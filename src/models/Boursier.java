package models;

import java.util.Date;

public class Boursier extends Etudiant {

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
    public Boursier(String nom, String prenom, int etat, String matricule, String email, Date dateDeNaissance,
            String telephone, String adresse, int montantBourse) {
        super(nom, prenom, etat, matricule, email, dateDeNaissance, telephone, adresse);
        this.montantBourse = montantBourse;
    }

    /**
     * type de la bourse
     */
    protected TypeBourse typeBourse;

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }

    /**
     ** montant de la bourse qui dépendent du type de la bourse
     */
    protected int montantBourse;

    public int getMontantBourse() {
        switch (typeBourse) {
            case DEMI:
                montantBourse = 20000;
                break;
            case ENTIERE:
                montantBourse = 40000;
                break;
            case EXCELLENCE:
                montantBourse = 60000;
                break;
            default:
                montantBourse = 0;
                break;
        }
        return montantBourse;
    }

    @Override
    public String toString() {
        return "Boursier [montantBourse=" + montantBourse + "]\n";
    }
}
