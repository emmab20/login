package com.login;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void login() throws IOException {
        System.out.println("Username: " + username.getText());
        System.out.println("Password: " + password.getText());

        if (username.getText().equals("emmanuel") && password.getText().equals("workingfromhome123!")) {
            System.out.println("User logged in!");
            App.setRoot("secondary");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
