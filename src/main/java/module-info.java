module com.zenteno.laberinto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zenteno.laberinto to javafx.fxml;
    exports com.zenteno.laberinto;
}