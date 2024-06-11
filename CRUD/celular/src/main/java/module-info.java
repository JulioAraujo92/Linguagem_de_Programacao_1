module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires javafx.base;

    opens com.example to javafx.fxml;
    exports com.example;
    exports com.example.controller to javafx.fxml;
    exports com.example.model to javafx.fxml;
    opens com.example.controller to javafx.fxml;
    opens com.example.model to javafx.base;
}

