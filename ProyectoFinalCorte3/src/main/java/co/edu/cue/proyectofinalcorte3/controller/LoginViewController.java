package co.edu.cue.proyectofinalcorte3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {

    private Stage stage;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TextField userNameInput;

    @FXML
    void changeView(ActionEvent event) {

    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
