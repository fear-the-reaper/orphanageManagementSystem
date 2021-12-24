package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.event.ActionEvent;

public class SampleController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
    
    @FXML
    private Label incorrect;

    @FXML
    void OnpressLogin(ActionEvent event) {
    	
    	Boolean check=Orphanage.Login(username.getText(),password.getText());
    	if(check==true)
    	{
    		incorrect.setText(null);
    		Stage primaryStage = new Stage();
    		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
             if (window instanceof Stage){
                 ((Stage) window).close();
             }
             try {
     			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("OrphanageMainMenu.fxml"));
     			Scene scene = new Scene(root,721,531);
     			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
     			primaryStage.setScene(scene);
     			primaryStage.setTitle("Orphanage Management System");
     			primaryStage.setResizable(false);
     			primaryStage.show();
     			
     		} catch(Exception e) {
     			e.printStackTrace();
     		}
    	}
    	else {
    		incorrect.setText("Incorrect Name or Password!");
    	}
    	
    }

}
