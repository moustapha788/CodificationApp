import actions.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nBienvenue Dans Codification App!\n\n");

        Menu menu = new Menu();
        menu.addItemMenu("1-Ajouter Pavillon");
        menu.addItemMenu("2-Lister Pavillons");
        menu.addItemMenu("3-Ajouter Chambre");
        menu.addItemMenu("4-Lister Chambres");
        menu.addItemMenu("5-Lister ");
        menu.addItemMenu("6-Pas encore disponible");
        menu.addItemMenu("7-Pas encore disponible");
        menu.addItemMenu("8-Pas encore disponible");
        menu.addItemMenu("9-Pas encore disponible");
        menu.addItemMenu("10-Pas encore disponible");
        menu.addItemMenu("11-Quitter");

        menu.mainMenu();

    }

}
