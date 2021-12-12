module OrphanageManagaement {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.persistence;
	
	opens application to javafx.graphics, javafx.fxml;
}
