package ui;

import businessLogic.Orphanage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class OrphanageMainMenuController {
	
	Orphanage orphanage=new Orphanage();
	@FXML
    private TextField parentcnic;

    @FXML
    private TextField childcnic;
    
    @FXML
    private Label adoptionsuccessful;
    
    @FXML
    void onclickrecord(ActionEvent event) {
    	
    	if(orphanage.MakeNewAdoption(parentcnic.getText(), childcnic.getText())==true)
    	{
    		adoptionsuccessful.setText("Adoption Recorded Successfuly");
    	}

    }
	
	
	@FXML
	void OnpressScheduleInterview(ActionEvent event) {
		
		Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
	    if (window instanceof Stage){
	        ((Stage) window).close();
	    }
		try {
			Stage primaryStage = new Stage();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("verification.fxml"));
			Scene scene = new Scene(root,721,531);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Verification");
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	  	
	 }
	 @FXML
	    void  OnpressMainMenu(ActionEvent event) {
	    	
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
	 
	 @FXML
	    void onpressRecordAdoption(ActionEvent event) {
		 
		 Stage primaryStage = new Stage();
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
      if (window instanceof Stage){
          ((Stage) window).close();
      }
      try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("recordadoption.fxml"));
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
	

}
