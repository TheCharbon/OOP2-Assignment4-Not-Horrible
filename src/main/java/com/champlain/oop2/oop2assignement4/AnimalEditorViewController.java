package com.champlain.oop2.oop2assignement4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnimalEditorViewController {


    @FXML
    private TextField aAnimalNameTextField;
    @FXML
    private TextField aAnimalWeightTextField;
    @FXML
    private TextField aAnimalAgeTextField;

    @FXML
    private Button aAnimalSaveButton;
    @FXML
    private Button aAnimalBackButton;

    @FXML
    protected void onAnimalSaveButtonClick() {
        System.exit(0);
    }
    @FXML
    protected void onAnimalBackButtonClick() {
        Stage stage = (Stage)  aAnimalBackButton.getScene().getWindow();
        stage.close();
    }

}
