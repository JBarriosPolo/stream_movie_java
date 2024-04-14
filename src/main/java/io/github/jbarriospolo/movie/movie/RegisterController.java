package io.github.jbarriospolo.movie.movie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblStatus;

    @FXML
    private void handleRegisterAction() {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.isEmpty() || password.isEmpty()) {
            lblStatus.setText("Nombre de usuario y contraseña son requeridos.");
            return;
        }

        boolean isRegistered = registerUser(username, password);

        if (isRegistered) {
            lblStatus.setText("Registro exitoso.");
        } else {
            lblStatus.setText("Registro fallido. El usuario ya existe o hubo un error.");
        }
    }

    private boolean registerUser(String username, String password) {
        // Implementar la lógica de registro.
        // Esta es solo una simulación. Aquí iría el código para interactuar con la base de datos.
        return true; // Simulando un registro exitoso.
    }
}
