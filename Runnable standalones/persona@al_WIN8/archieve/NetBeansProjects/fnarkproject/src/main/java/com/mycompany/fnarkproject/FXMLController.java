package com.mycompany.fnarkproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField registration_id;
    @FXML
    private TextField registered_lock_key;
    @FXML
    private RadioButton keep_me_logged_in;
    @FXML
    private Slider slider;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
