module com.main.ejercicio1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.main.ejercicio1_1 to javafx.fxml;
    exports com.main.ejercicio1_1;
}
