package models;

public class AnneeScolaire {
    /**
     ** Default constructor
     */
    public AnneeScolaire() {
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
     ** Année académique
     */
    private String libelleAnnee;

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
}
