package models;

public class Boursier  extends Etudiant{
     /**
     ** Default constructor
     */
    public Boursier() {
    }

    /**
     ** montant de la bourse qui dépendent du type de la bourse
     */
    protected int montantBourse;

    @Override
    public String toString() {
        return "Boursier [montantBourse=" + montantBourse + "]\n";
    }
}
