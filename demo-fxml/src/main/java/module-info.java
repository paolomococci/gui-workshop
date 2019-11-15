module local.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens local.example.demo to javafx.fxml;
    exports local.example.demo;
}
