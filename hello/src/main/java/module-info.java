module local.example.hello {
    requires javafx.controls;
    requires javafx.fxml;

    opens local.example.hello to javafx.fxml;
    exports local.example.hello;
}
