package models;

public class Chambre {
    /**
     ** Default constructor
     */
    public Chambre() {
    }

    /**
     ** identifier
     */
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     ** numéro de chambre
     */
    private int numeroChambre;

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    /**
     ** numéro de l'étage de la chambre
     */
    private int numeroEtage;

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    /**
     ** etat de la chambre
     */
    private int etat = 1;

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Chambre [etat=" + etat + ", id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage="
                + numeroEtage + "]\n";
    }

}
