package models;

public abstract class Personne {
    /**
     * @param nom
     * @param prenom
     * @param etat
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

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
     **le nombre de personnes créées
     */
    public static int countPerson=0;

    

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
    protected boolean etat = true;

   
    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Personne [etat=" + etat + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]\n";
    }

}
