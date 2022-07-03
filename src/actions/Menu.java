package actions;

import java.util.Scanner;

import IServices.IService;
import Services.ServiceTableau;
import models.Chambre;
import models.Pavillon;
import models.TypeChambre;

public class Menu {
    private int response;
    private int quitter;
    // private int nbrPav;

    private int indexMenu;
    private final int TAILLE_MENU = 10;
    private String[] itemsMenu = new String[TAILLE_MENU];

    public void addItemMenu(String item) {
        if (indexMenu < TAILLE_MENU) {
            itemsMenu[indexMenu] = item;
            indexMenu++;
        } else {
            System.out.println("--LE TABLEAU DE MENU EST PLEIN--");
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
        try (Scanner sc = new Scanner(System.in)) {
            do {

                this.showItemMenu();
                System.out.print("\n--Saisir les chiffres corresponant à chacun de ces items pour y accéder: ");
                IService service = new ServiceTableau();
                do {
                    this.response = sc.nextInt();
                    if (this.response < 0) {
                        System.out.println("DÉSOLÉ PAS DE NOMBRE NÉGATIF , Renseignez de nouveau");
                    }
                    if (this.response > itemsMenu.length) {
                        System.out.println("DÉSOLÉ VOUS DÉPASSER LE NOMBRE DE MENUS DÉFINI , Renseignez de nouveau");
                    }
                } while (this.response < 0 || this.response > itemsMenu.length);
                switch (response) {
                    case 1:
                        System.out.println("\n--AJOUT DE PAVILLON--\n");
                        System.out.print("Renseignez le nombre d'étages: ");
                        int nbrEtages = sc.nextInt();

                        Pavillon pavillon = new Pavillon(nbrEtages);
                        service.addPavillon(pavillon);
                        break;
                    case 2:
                        service.showPavillons();
                        break;
                    case 3:
                        System.out.println("--AJOUT DE CHAMBRE--");
                        System.out.println("--Renseignez le type de chambre en tapant le numéro correspondant. TAPEZ");
                        System.out.println("\t-1 pour INDIVIDUEL");
                        System.out.println("\t-autre numéro COLLECTIF");
                        int typeChoice = sc.nextInt();
                        TypeChambre typeChambre = TypeChambre.INDIVIDUEL;
                        if (typeChoice == 2) {
                            typeChambre = TypeChambre.COLLECTIF;
                        }
                        Chambre chambre = new Chambre(typeChambre);
                        service.addRoom(chambre);
                        break;
                    case 4:
                        service.showRooms();
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
                    default:
                        System.out.println("LA SAISIE EST INVALIDE:");
                        break;
                }
                System.out.println(
                        "\n--Si vous voulez quitter appuie sur ...\n\t1 pour confirmer  \n\tet \n\t0 pour annuler");
                this.quitter = sc.nextInt();
            } while (this.quitter != 1);
        }
    }

}
