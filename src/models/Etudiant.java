package models;

import java.util.Date;

public class Etudiant extends Personne {
    /**
     ** Default constructor
     */
    public Etudiant() {
    }


    /**
     ** matricule de l'étudiant
     */
    private String matricule;

    public String getMatricule() {
        return matricule;
        
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public Responsable getResponsable() {

        return new Responsable();
    }

    @Override
    public String toString() {
        return "Etudiant [adresse=" + adresse + ", dateDeNaissance=" + dateDeNaissance + ", email=" + email
                + ", matricule=" + matricule + ", telephone=" + telephone + "]\n";
    }

}
