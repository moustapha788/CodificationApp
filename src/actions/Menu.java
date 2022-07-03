package actions;

import java.util.Scanner;

import IServices.IService;
import Services.ServiceTableau;
import models.Pavillon;

public class Menu {
    private int response;
    private int nbrPav;
    
    private int indexMenu;
    private final int TAILLE_MENU = 10;
    private String[] itemsMenu = new String[TAILLE_MENU];

    public void addItemMenu(String item) {
        if (indexMenu < TAILLE_MENU) {
            itemsMenu[indexMenu] = item;
            indexMenu++;
        } else {
            System.out.println("le tableau de menu est plein");
        }
    }

    public void showItemMenu() {
        for (String item : itemsMenu) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public void mainMenu() {
        this.showItemMenu();
        System.out.println("\n Saisir les chiffres corresponant à chacun de ces items pour y accéder: ");
        IService service = new ServiceTableau();
        Scanner sc = new Scanner(System.in);

        do {
            this.response = sc.nextInt();
            if (this.response < 0) {
                System.out.println("Désolé pas de nombre négatif");
            }
            if (this.response > itemsMenu.length) {
                System.out.println("Désolé Vous dépasser le nombre de menus");
            }
        } while (this.response < 0 || this.response > itemsMenu.length);
        switch (response) {
            case 1:
                System.out.println("VOUS VOULEZ AJOUTER UN PAVILLON");
                System.out.println("Renseigner le nombre de pavillon à créer");
              
                do {
                    this.nbrPav = sc.nextInt();

                    if (this.nbrPav < 0) {
                        System.out.println("Désolé pas de nombre négatif");
                    }
                    if (this.nbrPav > ServiceTableau.indexChambre) {
                        System.out.println("Désolé nous avons pas assez d'espace pour ces chambres");
                        System.out.println("nombre de chambres disponibles "+ (ServiceTableau.TAILLE_PAVILLON - ServiceTableau.indexChambre));
                    }
                    System.out.println("Renseigner de nouveau le nombre de pavillon à créer");
                    
                } while (this.nbrPav < 0 || this.nbrPav > ServiceTableau.indexChambre);
                for (int i = 0; i < nbrPav; i++) {
                    System.out.println("Renseignez le nombre d'étages");
                    int nbrEtages = sc.nextInt();

                    Pavillon pavillon = new Pavillon(nbrEtages);
                    service.addPavillon(pavillon);
                }

                break;
            case 2:
                System.out.println("VOUS VOULEZ LISTER LES PAVILLONS");
                service.showPavillons();
                break;
            case 3:
                System.out.println("VOUS VOULEZ AJOUTER UNE CHAMBRE");
                break;
            case 4:
                System.out.println("VOUS VOULEZ LISTER LES CHAMBRES");
                break;
            case 5:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 6:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 7:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 8:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 9:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 10:
                System.out.println("CE MENU N'EST PAS ENCORE DÉFINI REVENEZ ULTÉRIEUREMENT");
                break;
            case 11:
                System.out.println("VOUS VOULEZ QUITTER appuie sur 1 pour confirmer  et 0 pour annuler");
                break;
            default:
                System.out.println("LA SAISIE EST INVALIDE:");
                break;
        }

    }

}
