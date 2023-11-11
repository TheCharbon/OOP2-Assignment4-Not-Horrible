package com.champlain.oop2.oop2assignement4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EnclosureManagerViewController implements Initializable {

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
    protected void onMainViewButtonClick(ActionEvent pEvent) throws IOException {
        AnimalCollection selectedAnimalCollection = aMainListView.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("EnclosureDisplayView.fxml"));
        Parent view = fxmlLoader.load();
        EnclosureDisplayViewController newEnclosureDisplayViewController = fxmlLoader.getController();
        newEnclosureDisplayViewController.setAnimalCollection(selectedAnimalCollection);
        Scene nextScene = new Scene(view, 500, 500);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle(selectedAnimalCollection.getName());
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        importAnimal();
    }

    public void importAnimal() {
        CompositeAnimal felineComposite = new CompositeAnimal();
        felineComposite.setName("Feline");

        CompositeAnimal tigerComposite = new CompositeAnimal();
        tigerComposite.setName("Tigers");

        Enclosure lionEnclosure = new Enclosure();
        lionEnclosure.setName("Lions");
        lionEnclosure.addAnimal(new Lion("Simba", 100, 5));
        lionEnclosure.addAnimal(new Lion("Mufasa", 300, 14));
        lionEnclosure.addAnimal(new Lion("Nala", 200, 10));

        Enclosure tigerCubsEnclosure = new Enclosure();
        tigerCubsEnclosure.setName("Tiger Cubs");
        tigerCubsEnclosure.addAnimal(new Tiger("Tala (Mother)", 150, 6));
        tigerCubsEnclosure.addAnimal(new Tiger("Ravi", 20, 1));

        Enclosure tigerGeneralHabitatEnclosure = new Enclosure();
        tigerGeneralHabitatEnclosure.addAnimal(new Tiger("Kali", 18, 1));
        tigerGeneralHabitatEnclosure.addAnimal(new Tiger("Indra", 22, 1));

        Enclosure cougarEnclosure = new Enclosure();
        cougarEnclosure.setName("Cougars");
        cougarEnclosure.addAnimal(new Cougar("Sierra", 20, 5));
        cougarEnclosure.addAnimal(new Cougar("Rocky", 24, 8));
        cougarEnclosure.addAnimal(new Cougar("Luna", 35, 12));
        cougarEnclosure.addAnimal(new Cougar("Lenny", 54, 15));

        tigerComposite.addAnimalCollection(tigerCubsEnclosure);
        tigerComposite.addAnimalCollection(tigerGeneralHabitatEnclosure);

        felineComposite.addAnimalCollection(lionEnclosure);
        felineComposite.addAnimalCollection(tigerComposite);
        felineComposite.addAnimalCollection(cougarEnclosure);

        for(AnimalCollection animalGroup : felineComposite.animalCollections){
            aMainListView.getItems().add(animalGroup);
        }
    }

}