package co.edu.cue.proyectofinalcorte3.controller;
import co.edu.cue.proyectofinalcorte3.service.*;
import co.edu.cue.proyectofinalcorte3.service.impl.TheaterServiceImpl;


public class ModelFactoryController implements ModelFactoryControllerService {

    TheaterServiceImpl theater;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        theater = new TheaterServiceImpl();
    }

}
