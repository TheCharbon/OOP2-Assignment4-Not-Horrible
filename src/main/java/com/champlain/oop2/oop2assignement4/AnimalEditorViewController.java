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
    private boolean aIsNew = true;

    private Animal aAnimal;

    private Enclosure aEnclosure;

    @FXML
    protected void onAnimalSaveButtonClick() {
        String name = aAnimalNameTextField.getText();
        double weight = Double.parseDouble(aAnimalWeightTextField.getText());
        int age = Integer.parseInt(aAnimalAgeTextField.getText());

        if (this.aIsNew) {
            Animal animal = new Animal(name, weight, age);
            aEnclosure.addAnimal(animal);
        } else {
            this.aAnimal.setName(name);
            this.aAnimal.setWeight(weight);
            this.aAnimal.setAge(age);
        }

        onAnimalBackButtonClick();
    }

    @FXML
    protected void onAnimalBackButtonClick() {
        Stage stage = (Stage)  aAnimalNameTextField.getScene().getWindow();
        stage.close();
    }

    public void setAnimal(Animal animal) {
        aIsNew = false;
        aAnimal = animal;
        aAnimalNameTextField.setText(animal.getName());
        aAnimalWeightTextField.setText(String.valueOf(animal.getWeight()));
        aAnimalAgeTextField.setText(String.valueOf(animal.getAge()));
    }

    public void setEnclosure(Enclosure pEnclosure) {
        this.aEnclosure = pEnclosure;
    }
}
