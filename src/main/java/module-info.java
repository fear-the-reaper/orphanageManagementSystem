module ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens ui to javafx.fxml;
    exports ui;
}