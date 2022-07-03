package models;

public class Pavillon {
    /**
     * @param nombreEtage
     */
    public Pavillon(int nombreEtage) {

        this.nombreEtage = nombreEtage;
        countPav++;
    }

    /**
     ** identifier
     */
    private int id = countPav;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     ** nombre de Pavillons
     */
    public static int countPav = 0;

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
    private boolean etat = true;

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Pavillon [ id=" + id + ", nombreEtage=" + nombreEtage + ", numero=" + numero + " , etat=" + etat + "]";
    }
}
