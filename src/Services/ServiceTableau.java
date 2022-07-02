package Services;

import IServices.IService;
import models.AnneeScolaire;
import models.Chambre;
import models.Etudiant;
import models.Loge;
import models.Pavillon;

public class ServiceTableau implements IService {
    private final int TAILLE_PAVILLON = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE_PAVILLON];
    private int indexPavillon;

    @Override
    public void addPavillon(Pavillon pavillon) {
        if (indexPavillon < TAILLE_PAVILLON) {
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
        } else {
            System.out.println("le tableau est plein");
        }
    }

    @Override
    public void showPavillons() {
        for (Pavillon p : pavillons) {
            if (p != null) {
                System.out.println(p);
            }
        }

    }

    @Override
    public void deletePavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addRoom(Chambre chambre) {
        // TODO Auto-generated method stub

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
