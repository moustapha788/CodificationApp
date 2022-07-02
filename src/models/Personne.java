package models;

public abstract class Personne {
    /**
     ** identifiant de la personne
     */
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     ** nom de la personne
     */
    protected String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     ** prénom de la personne
     */
    protected String prenom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     ** l'état de la personne
     */
    protected int etat = 1;

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Personne [etat=" + etat + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]\n";
    }

}
