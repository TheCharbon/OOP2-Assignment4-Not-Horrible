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
        String name = aAnimalNameTextField.getText();
        double weight = Double.parseDouble(aAnimalWeightTextField.getText());
        int age = Integer.parseInt(aAnimalAgeTextField.getText());

        Animal animal = new Animal(name, weight, age);

        Stage stage = (Stage) aAnimalSaveButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onAnimalBackButtonClick() {
        Stage stage = (Stage)  aAnimalBackButton.getScene().getWindow();
        stage.close();
    }

    public void setAnimal(Animal animal) {
        aAnimalNameTextField.setText(animal.getName());
        aAnimalWeightTextField.setText(String.valueOf(animal.getWeight()));
        aAnimalAgeTextField.setText(String.valueOf(animal.getAge()));
    }
}
