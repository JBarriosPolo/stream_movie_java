package io.github.jbarriospolo.movie.movie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class AccessController {
    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    @FXML
    private Label loginMessageLabel;

    @FXML
    private Button loginButton;

    @FXML
    private void initialize() {
        loginButton.setOnAction(this::handleLoginAction);
    }

    private void handleLoginAction(ActionEvent event) {
        String username = user.getText().trim();
        String password = pass.getText().trim();
        String tabla = "usuarios";

        if (username.isEmpty() || password.isEmpty()) {
            loginMessageLabel.setText("Usuario y contraseña no pueden estar vacíos.");
            return;
        }

        boolean iduser = ConsultasDB.consulta(tabla, "username", username);
        boolean idpass = ConsultasDB.consulta(tabla, "password", password);

        if (iduser && idpass) {
            loginMessageLabel.setText("Inicio de sesión exitoso.");
        } else {
            loginMessageLabel.setText("Credenciales incorrectas.");
        }
    }
}
