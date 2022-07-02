package IServices;

import models.AnneeScolaire;
import models.Chambre;
import models.Etudiant;
import models.Loge;
import models.Pavillon;

public interface IService {
    /* PAVILLONS */
    public void addPavillon(Pavillon pavillon);

    public void showPavillons();

    public void deletePavillon(Pavillon pavillon);

    /* CHAMBRES */
    public void addRoom(Chambre chambre);

    public void showRooms();

    public void archiveRoom(Chambre chambre);

    /* ÉTUDIANTS */
    public void addStudent(Etudiant etudiant);

    /* OPÉRATIONS PEU COMPLEXES */
    public void affectRoomToPavillon(Pavillon pavillon, Chambre chambre);

    public void affectRoomToScholarShipHolder(Chambre chambre,Etudiant etudiant);

    public void showStudentsOfRoom(Chambre chambre);

    public void ajouterAnneeScolaire(AnneeScolaire anneeScolaire);
    
    public void codifier(Chambre chambre,Loge etudiant);
    

}