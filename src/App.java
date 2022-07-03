import actions.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Bienvenue Dans Codification App!\n");

        Menu menu = new Menu();
        menu.addItemMenu("1-Ajouter Pavillon");
        menu.addItemMenu("2-Ajouter Chambre");
        menu.addItemMenu("3-Lister Pavillons");
        menu.addItemMenu("4-Lister Chambres");
        menu.addItemMenu("5-Lister Chambres");
        menu.addItemMenu("6-Lister Chambres");
        menu.addItemMenu("7-Lister Chambres");
        menu.addItemMenu("8-Lister Chambres");
        menu.addItemMenu("9-Lister Chambres");
        menu.addItemMenu("10-Lister Chambres");
        menu.addItemMenu("11-Quitter");

        menu.mainMenu();

    }

}
