package com.champlain.oop2.oop2assignement4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

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
    private ListView<Animal> aEnclosureAnimalListView;


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



}
