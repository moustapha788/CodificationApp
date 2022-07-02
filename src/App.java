import IServices.IService;
import Services.ServiceTableau;
import models.Pavillon;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Bienvenue Dans Codification App!\n");
        IService service = new ServiceTableau();
        Pavillon pavillon = new Pavillon();
        pavillon.setId(1);
        pavillon.setNumero(1);
        pavillon.setNombreEtage(4);
        service.addPavillon(pavillon);
        service.showPavillons();
    }
}
