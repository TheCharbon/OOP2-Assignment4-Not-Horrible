package com.champlain.oop2.oop2assignement4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.List;

public class EnclosureDisplayViewController {
    @FXML
    private Button aEnclosureViewEditButton;
    @FXML
    private Button aEnclosureAddButton;
    @FXML
    private Button aEnclosureRemoveButton;
    @FXML
    private Button aEnclosureBackButton;

    @FXML
    public ListView<Animal> aEnclosureAnimalListView;

    @FXML
    protected void onEnclosureViewEditButtonClick() {
        System.exit(0);
    }
    @FXML
    protected void onEnclosureAddButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onEnclosureRemoveButtonClick() {
        System.exit(0);
    }
    @FXML
    protected void onEnclosureBackButtonClick() {
        Stage stage = (Stage) aEnclosureBackButton.getScene().getWindow();
        stage.close();
    }

    public void setAnimalCollection(AnimalCollection animalCollection) {

        // Display the animals from the selectedAnimalCollection
        aEnclosureAnimalListView.getItems().setAll(animalCollection.getAnimals());
    }

    public void initialize() {
        aEnclosureAnimalListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(Animal animal, boolean empty) {
                super.updateItem(animal, empty);
                if (empty || animal == null) {
                    setText(null);
                } else {
                    setText(animal.getName());
                }
            }
        });
    }

}
