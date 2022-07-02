package models;

public abstract class User extends Personne {

    /**
     ** email de l'utilisateur
     */
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     ** mot de passe de l'utilisateur
     *
     */
    protected String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return /* parent::toString() + */ "User [email=" + email + ", password=" + password + "]";
    }

}
