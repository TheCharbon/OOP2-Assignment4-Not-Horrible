package com.champlain.oop2.oop2assignement4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

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
    protected void onEnclosureViewEditButtonClick(ActionEvent pEvent) throws IOException {
        Enclosure pEnclosure = new Enclosure();
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("AnimalEditorView.fxml"));
        Parent view = fxmlLoader.load();
        AnimalEditorViewController newAnimalEditorViewController = fxmlLoader.getController();
        Animal selectedAnimal = aEnclosureAnimalListView.getSelectionModel().getSelectedItem();
        newAnimalEditorViewController.setAnimal(selectedAnimal);
        Scene nextScene = new Scene(view, 500, 500);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle(pEnclosure.getName());
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    @FXML
    protected void onEnclosureAddButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onEnclosureRemoveButtonClick() {
        Animal selectedAnimal = aEnclosureAnimalListView.getSelectionModel().getSelectedItem();
        if (selectedAnimal != null) {
            aEnclosureAnimalListView.getItems().remove(selectedAnimal);
        }
    }
    @FXML
    protected void onEnclosureBackButtonClick() {
        Stage stage = (Stage) aEnclosureBackButton.getScene().getWindow();
        stage.close();
    }

    public void setAnimalCollection(AnimalCollection animalCollection) {
        aEnclosureAnimalListView.getItems().setAll(animalCollection.getAnimals());
    }

    // From ChatGPT.
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
