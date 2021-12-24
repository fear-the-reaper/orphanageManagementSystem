module orphanageManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
	requires javafx.base;
    opens ui to javafx.fxml;
    opens businessLogic to org.hibernate.orm.core;
    exports ui;
    exports businessLogic;
}
