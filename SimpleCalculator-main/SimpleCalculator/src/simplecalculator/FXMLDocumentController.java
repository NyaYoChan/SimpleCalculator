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
import javafx.scene.control.TextArea;
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
    private TextArea screenTextArea;
    
    @FXML
    private Button plusButton;
    @FXML
    private Button minusButton;
    @FXML
    private Button multiplyButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button modButton;
    @FXML
    private Button clearButton;
    
    double number1;
    double number2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void calculate(ActionEvent event){
        try{
            String number1_context = number1TextField.getText();
            String number2_context = number2TextField.getText();
            number1 = Double.valueOf(number1_context);
            number2 = Double.valueOf(number2_context);
            Button pressedButton = (Button)event.getSource();
            switch(pressedButton.getText()){
                case "+":
                    screenTextArea.appendText(number1_context + " + " + number2_context + " = " + String.valueOf(number1 + number2) + "\n");
                    break;
                case "-":
                    screenTextArea.appendText(number1_context + " - " + number2_context + " = " + String.valueOf(number1 - number2) + "\n");
                    break;
                case "*":
                    screenTextArea.appendText(number1_context + " * " + number2_context + " = " + String.valueOf(number1 * number2) + "\n");
                    break;
                case "/":
                    screenTextArea.appendText(number1_context + " / " + number2_context + " = " + String.valueOf(number1 / number2) + "\n");
                    break;
                case "%":
                    screenTextArea.appendText(number1_context + " % " + number2_context + " = " + String.valueOf(number1 % number2) + "\n");
                    break;
                case "C":
                    screenTextArea.clear();
                    break;
            }
            
        }catch(Exception e){
//            System.out.println(e);
        }
    }
    
}
