package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class OrphanageMainMenuController {

    @FXML
    void OnpressScheduleInterview(ActionEvent event) {
    	
    	Stage primaryStage = new Stage();
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
        if (window instanceof Stage){
            ((Stage) window).close();
        }
        try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("PersonVerification.fxml"));
			Scene scene = new Scene(root,721,531);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Schedule Interview/ Verification");
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

}
