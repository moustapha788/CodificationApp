package Services;

import IServices.IService;
import models.AnneeScolaire;
import models.Chambre;
import models.Etudiant;
import models.Loge;
import models.Pavillon;

public class ServiceTableau implements IService {
    public static final int TAILLE_PAVILLON = 10;
    public static final int TAILLE_CHAMBRE = 1000;
    private static Pavillon[] pavillons = new Pavillon[TAILLE_PAVILLON];
    private static Chambre[] chambres = new Chambre[TAILLE_CHAMBRE];
    public static int indexPavillon;
    public static int indexChambre;

    @Override
    public void addPavillon(Pavillon pavillon) {
        if (indexPavillon < TAILLE_PAVILLON) {
            pavillon.setNumero(Pavillon.countPav);
            pavillon.setId(Pavillon.countPav);

            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
            System.out.println("\n--NOUVEAU PAVILLON AJOUTÉ\n");
            displayPavillon(pavillon);
        } else {
            System.out.println("LE TABLEAU EST PLEIN");
        }
    }

    public void displayPavillon(Pavillon pavillon) {
        System.out.println(pavillon);
    }

    @Override
    public void showPavillons() {
        System.out.println("\n--LISTE DES PAVILLONS--\n");
        for (Pavillon p : pavillons) {
            if (p != null) {
                displayPavillon(p);
            }
        }
        System.out.println("\nNOMBRE TOTAL DE PAVILLONS: " + Pavillon.countPav+"\n");
    }

    @Override
    public void addRoom(Chambre chambre) {
        if (indexChambre < TAILLE_CHAMBRE) {
            chambre.setNumeroChambre(Chambre.countRoom);
            chambre.setId(Chambre.countRoom);

            chambres[indexChambre] = chambre;
            indexChambre++;
            System.out.println("\n--NOUVEAU CHAMBRE AJOUTÉ\n");
            displayRoom(chambre);

        } else {
            System.out.println("LE TABLEAU EST PLEIN");
        }
    }

    public void displayRoom(Chambre chambre) {
        System.out.println(chambre);
    }

    @Override
    public void showRooms() {
        System.out.println("\n--LISTE DES CHAMBRES--\n");
        for (Chambre ch : chambres) {
            if (ch != null) {
                displayRoom(ch);

            }
        }
        System.out.println("\nNOMBRE TOTAL DE CHAMBRES: " + Chambre.countRoom+"\n");
    }

    @Override
    public void deletePavillon(Pavillon pavillon) {
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
