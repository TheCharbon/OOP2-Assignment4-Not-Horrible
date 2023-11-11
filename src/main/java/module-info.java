module com.champlain.oop2.oop2assignement4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.champlain.oop2.oop2assignement4 to javafx.fxml;
    exports com.champlain.oop2.oop2assignement4;
}