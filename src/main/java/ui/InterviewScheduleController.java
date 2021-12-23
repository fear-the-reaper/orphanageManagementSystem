package ui;

import java.util.Date;
import java.util.List;

import businessLogic.Available_Slot;
import businessLogic.Orphanage;
import businessLogic.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class InterviewScheduleController {

    @FXML
    private Label availableslots;

    @FXML
    private TextField slotno;
    
    @FXML
    private TextField cnic=null;

    @FXML
    private TextField name=null;

    @FXML
    private TextField nationality;

    @FXML
    private TextField address;

    @FXML
    private RadioButton genderm;

    @FXML
    private RadioButton genderf;

    @FXML
    private Date dateofbirth;
    
    @FXML
    private Label notvalidcnic;
    
    @FXML
    private Label empty;

    @FXML
    private Label invalidslotno;
    
    @FXML
    private Label reserved;


    	Person p;

@FXML
void OnPressContinue(ActionEvent event) {
	
	if(cnic.getText().isEmpty()||name.getText().isEmpty()||nationality.getText().isEmpty()||dateofbirth.toString().isEmpty()||address.getText().isEmpty())
	{
		empty.setText("Fill All Fields");
		}
	else if(genderm.getText().isEmpty()&&genderf.getText().isEmpty())
	{
		empty.setText("Fill All Fields");
		
		}
	else if(Orphanage.VerifyPerson(cnic.getText(), "batman"))
	{
		 Stage primaryStage = new Stage();
   		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
         try {
        	 p.setCnic(cnic.getText());
        	 p.setDateOfBirth(dateofbirth);
        	 p.setName(name.getText());
   			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ScheduleInterview.fxml"));
   			Scene scene = new Scene(root,721,531);
   			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
   			primaryStage.setScene(scene);
   			primaryStage.setTitle("Schedule Interview");
   			primaryStage.setResizable(false);
   			primaryStage.show();
   			
   		} catch(Exception e) {
   			e.printStackTrace();
   		}
	}
	else
	{
    		
           notvalidcnic.setText("Enter Valid cnic witout - ");
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
    Orphanage orphanage=new Orphanage();
    List<Available_Slot> slotslist;

    @FXML
    void onpressReserve(ActionEvent event) {
    	Boolean check=false;
    	int i=Integer.parseInt(slotno.getText());
    	if(i>slotslist.size()||i<=0)
    	{
    		invalidslotno.setText("Invalid Slot Number");
    	}
    	else 
    		{
    			check=orphanage.reserveSlot(p, slotslist.get(i).getAvailable_slot_date(),slotslist.get(i).getAvailable_slot_time());
    		}
    	if(check==true)
    	{
    		reserved.setText("Slot Reserved Succesfuly");
    	}

    }

    @FXML
    void onpressStart(ActionEvent event) {
    	
    	
    	
    	slotslist=orphanage.getAvailableSlots();
    	String s="";
        for(int i=0;i<slotslist.size();i++)
        {
            s=s+slotslist.get(i).toString();
        }
        
        System.out.println(s);
        availableslots.setText(s);
    	
    }
   

}
