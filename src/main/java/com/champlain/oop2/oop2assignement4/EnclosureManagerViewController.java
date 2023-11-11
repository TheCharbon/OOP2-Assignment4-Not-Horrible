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

    public void importAnimal() {
        // Create the animal structure
        CompositeAnimal felineComposite = new CompositeAnimal();
        felineComposite.setName("Feline");

        CompositeAnimal tigerComposite = new CompositeAnimal();
        tigerComposite.setName("Tigers");

        Enclosure lionEnclosure = new Enclosure();
        lionEnclosure.setName("Lions");
        lionEnclosure.addAnimal(new Lion("Simba", 100, 5));
        lionEnclosure.addAnimal(new Lion("Mufasa", 300, 14));
        lionEnclosure.addAnimal(new Lion("Nala", 200, 10));

        Enclosure tigerEnclosure = new Enclosure();
        tigerEnclosure.setName("Tiger Cubs");
        tigerEnclosure.addAnimal(new Tiger("Tala (Mother)", 150, 6));
        tigerEnclosure.addAnimal(new Tiger("Ravi", 20, 1));
        tigerEnclosure.addAnimal(new Tiger("Kali", 18, 1));
        tigerEnclosure.addAnimal(new Tiger("Indra", 22, 1));

        CompositeAnimal isolationComposite = new CompositeAnimal();
        isolationComposite.setName("Isolation enclosure (empty)");

        CompositeAnimal cougarComposite = new CompositeAnimal();
        cougarComposite.setName("Cougars");

        Enclosure medicalCareEnclosure = new Enclosure();
        medicalCareEnclosure.setName("Medical Care Section");
        medicalCareEnclosure.addAnimal(new Lion("Sierra", 120, 8));
        medicalCareEnclosure.addAnimal(new Lion("Rocky", 140, 9));
        medicalCareEnclosure.addAnimal(new Lion("Luna", 110, 7));
        medicalCareEnclosure.addAnimal(new Lion("Lenny", 130, 10));

        // Build the hierarchy
        tigerComposite.addAnimalCollection(tigerEnclosure);
        tigerComposite.addAnimalCollection(isolationComposite);

        felineComposite.addAnimalCollection(lionEnclosure);
        felineComposite.addAnimalCollection(tigerComposite);
        felineComposite.addAnimalCollection(cougarComposite);
        felineComposite.addAnimalCollection(medicalCareEnclosure);

        // Display the animals
        System.out.println(felineComposite.showAnimals());
    }
}