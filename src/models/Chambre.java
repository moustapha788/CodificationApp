package models;

public class Chambre {

    /**
     * @param id
     * @param numeroChambre
     * @param numeroEtage
     * @param etat
     */
   
    public Chambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
        countRoom++;
    }
    /**
     ** nombre de Pavillons
     */
    public static int countRoom = 0;
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

    private TypeChambre typeChambre;

    public TypeChambre getTypeChambre() {
        switch (typeChambre) {
            case INDIVIDUEL:
                typeChambre = TypeChambre.INDIVIDUEL;
                break;
            case COLLECTIF:
                typeChambre = TypeChambre.COLLECTIF;
                break;
            default:
                System.out.println("désolé ce type n'existe pas");
                break;
        }
        return typeChambre;

    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    /**
     ** etat de la chambre
     */
    private boolean etat = true;

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Chambre [ id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage="
                + numeroEtage + ", typeChambre=" + typeChambre + ", etat=" + etat+"]";
    }

  

}
