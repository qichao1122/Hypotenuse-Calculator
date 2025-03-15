package com.example.lab7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField aInput;
    @FXML private TextField bInput;
    @FXML private TextField cOutput;

    @FXML private Label errorMsg1;
    @FXML private Label errorMsg2;

    @FXML
    protected void onCalButtonClick(){
        if(isNumeric(aInput.getText()) && isNumeric(bInput.getText())) {
            double a = Double.parseDouble(aInput.getText());
            double b = Double.parseDouble(bInput.getText());
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            cOutput.setText(String.valueOf(c));
        } else {
            errorMsg1.setText("Please enter valid numbers for both sides.");
        }
    }

    @FXML
    protected void onClearButtonClick(){
        errorMsg1.setText("");
        errorMsg2.setText("");
        aInput.setText("");
        bInput.setText("");
        cOutput.setText("");
    }

    @FXML
    protected void clearAInput(){
        errorMsg1.setText("");
        errorMsg2.setText("");
        aInput.setText("");
    }

    @FXML
    protected void clearBInput(){
        errorMsg1.setText("");
        errorMsg2.setText("");
        bInput.setText("");
    }

    private boolean isNumeric(String inputString){
        if(inputString == null){
            return false;
        }

        try{
            Double.parseDouble(inputString);
        } catch (NumberFormatException error){
            return false;
        }
        return true;
    }
}
