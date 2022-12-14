/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label number1Label;
    @FXML
    private Label number2Label;
    
    @FXML
    private TextField number1TextField;
    @FXML
    private TextField number2TextField;
    @FXML
    private TextField screenTextField;
    
    @FXML
    private Button addButton;
    
    double number1;
    double number2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addButton.setOnAction(this::add);
    }    
    
    public void add(ActionEvent event){
        number1 = Double.valueOf(number1TextField.getText());
        number2 = Double.valueOf(number2TextField.getText());
        screenTextField.appendText(String.valueOf(number1+number2));
    }
    
}
