package com.champlain.oop2.oop2assignement4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class EnclosureManagerViewController {

    @FXML
    private Button aMainView;
    @FXML
    private Button aMainExit;

    @FXML
    private ListView<AnimalCollection> aMainListView;

    @FXML
    protected void onMainExitButtonClick() {
       System.exit(0);
    }
    @FXML
    protected void onMainViewButtonClick() {
        System.exit(0);
    }
}