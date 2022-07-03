package Services;

import IServices.IService;
import models.AnneeScolaire;
import models.Chambre;
import models.Etudiant;
import models.Loge;
import models.Pavillon;
import models.Personne;

public class ServiceTableau implements IService {
    public static final int TAILLE_PAVILLON = 10;
    public static final int TAILLE_CHAMBRE = 1000;
    private Pavillon[] pavillons = new Pavillon[TAILLE_PAVILLON];
    private Chambre[] chambres = new Chambre[TAILLE_CHAMBRE];
    public static int indexPavillon;
    public static int indexChambre;
    
    

    @Override
    public void addPavillon(Pavillon pavillon) {
        if (indexPavillon < TAILLE_PAVILLON) {
            pavillon.setNumero(Pavillon.countPav);
            pavillon.setId(++Personne.countPerson);

            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
        } else {
            System.out.println("LE TABLEAU EST PLEIN");
        }
    }

    @Override
    public void showPavillons() {
        for (Pavillon p : pavillons) {
            if (p != null) {
                System.out.println(p);
            }
        }
        System.out.println("\nNOMBRE TOTAL DE PAVILLONS: " + Pavillon.countPav);
    }

    @Override
    public void deletePavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        

    }

    @Override
    public void addRoom(Chambre chambre) {
        // TODO Auto-generated method stub
        if (indexChambre < TAILLE_CHAMBRE) {
            chambre.setNumeroChambre(Chambre.countRoom);
            chambre.setId(++Personne.countPerson);

            chambres[indexChambre]=chambre;
            indexChambre++;
        } else {
            System.out.println("LE TABLEAU EST PLEIN");
        }

    }

    @Override
    public void showRooms() {
        // TODO Auto-generated method stub

    }

    @Override
    public void archiveRoom(Chambre chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addStudent(Etudiant etudiant) {
        // TODO Auto-generated method stub

    }

    @Override
    public void affectRoomToPavillon(Pavillon pavillon, Chambre chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void affectRoomToScholarShipHolder(Chambre chambre, Etudiant etudiant) {
        // TODO Auto-generated method stub

    }

    @Override
    public void showStudentsOfRoom(Chambre chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ajouterAnneeScolaire(AnneeScolaire anneeScolaire) {
        // TODO Auto-generated method stub

    }

    @Override
    public void codifier(Chambre chambre, Loge etudiant) {
        // TODO Auto-generated method stub
    }
}
