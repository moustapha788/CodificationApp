package models;

public class AnneeScolaire {
    

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
     ** Année académique
     */
    private String libelleAnnee;

    /**
     * @param id
     * @param libelleAnnee
     */
    public AnneeScolaire(String libelleAnnee) {
        this.libelleAnnee = libelleAnnee;
    }

    public String getLibelleAnnee() {
        return libelleAnnee;
    }

    public void setLibelleAnnee(String libelleAnnee) {
        this.libelleAnnee = libelleAnnee;
    }

    @Override
    public String toString() {
        return "AnneeScolaire [id=" + id + ", libelleAnnee=" + libelleAnnee + "]\n";
    }

    private boolean etat = true;

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
