package models;

public class Pavillon {
    /**
     ** Default constructor
     */
    public Pavillon() {
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
     ** numéro du pavillon
     */
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     ** nombre d'étages
     */
    private int nombreEtage;

    public int getNombreEtage() {
        return nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    /**
     ** état du pavillon
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
        return "Pavillon [etat=" + etat + ", id=" + id + ", nombreEtage=" + nombreEtage + ", numero=" + numero + "]\n";
    }

}
