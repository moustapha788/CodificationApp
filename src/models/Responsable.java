package models;

public class Responsable extends User {

    /**
     * @param nom
     * @param prenom
     * @param etat
     * @param email
     * @param password
     */
    public Responsable(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }

    /**
     ** chaque responsable peut ajouter au plus 10000 étudiant
     * 
     * @return Etudiant[]
     */
    public Etudiant[] getEtudiants() {
        Etudiant[] etudiants = new Etudiant[10000];
        return etudiants;
    }

    /**
     ** chaque responsable peut ajouter au plus 20 pavillons
     * 
     * @return Pavillon[]
     */
    public Pavillon[] getPavillons() {
        Pavillon[] pavillons = new Pavillon[20];
        return pavillons;
    }

    @Override
    public String toString() {

        return /* parent::toString()+ */"Responsable []\n";
    }
}
