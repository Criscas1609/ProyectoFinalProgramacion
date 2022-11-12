module co.edu.cue.proyectofinalcorte3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    exports co.edu.cue.proyectofinalcorte3;
    exports co.edu.cue.proyectofinalcorte3.controller to javafx.fxml;
    opens co.edu.cue.proyectofinalcorte3.controller to javafx.fxml;
    opens co.edu.cue.proyectofinalcorte3 to javafx.graphics;
    exports co.edu.cue.proyectofinalcorte3.model to javafx.fxml;
    opens co.edu.cue.proyectofinalcorte3.model to javafx.base;
}