package models;

import java.util.Date;

public class Etudiant extends Personne {

    /**
     * @param nom
     * @param prenom
     * @param etat
     * @param matricule
     * @param email
     * @param dateDeNaissance
     * @param telephone
     * @param adresse
     */
    public Etudiant(String nom, String prenom, int etat, String matricule, String email, Date dateDeNaissance,
            String telephone, String adresse) {
        super( nom, prenom);
        this.matricule = matricule;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        
    }
    /**
     ** matricule de l'étudiant
     */
    private String matricule;

    public String getMatricule() {
        return matricule;

    }

    /**
     ** email de l'étudiant
     */
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     ** date de Naissance de l'étudiant
     */
    private Date dateDeNaissance;

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     ** numéro téléphone de l'étudiant
     */
    private String telephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     ** adresse de l'étudiant
     */
    private String adresse = null;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     ** chaque étudiant est ajouté par un responsable
     * 
     * @return Responsable
     */

    // public Responsable getResponsable() {

    // return new Responsable();
    // }

    @Override
    public String toString() {
        return "Etudiant [adresse=" + adresse + ", dateDeNaissance=" + dateDeNaissance + ", email=" + email
                + ", matricule=" + matricule + ", telephone=" + telephone + "]\n";
    }

    

}
