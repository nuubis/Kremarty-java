package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	
	@FXML
	public Button play, load, help, quit, startGame, back;
	public TextField insertName;
	RadioButton radioHuman, radioElf, radioDwarf, radioMale, radioFemale;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("System working!");
	}
	
	@FXML
	private void changeScene(ActionEvent event) throws IOException{
		System.out.println("I work");
	    Stage stage; 
	    Parent root;
	    if(event.getSource()==play){
	       //get reference to the button's stage         
	       stage=(Stage) play.getScene().getWindow();
	       //load up OTHER FXML document
	       root = FXMLLoader.load(getClass().getResource("/ui/CreateCharacter.fxml"));
	    }
	    
	    
	    else if (event.getSource()==load){
	    	stage=(Stage) load.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CreateCharacter.fxml"));
	    }
	    
	    else if (event.getSource()==help){
	    	stage=(Stage) help.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CreateCharacter.fxml"));
	    }
	     
	    else {
	    	stage=(Stage) back.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
		    }
	    //create a new scene with root and set the stage
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	    }
	
	private void createCharacter(ActionEvent event) throws IOException{
		String race;
		String name;
		String gender;
		Stage stage; 
	    Parent root;
		
	    //which single radio button is selected?
	    if(radioHuman.isSelected()) race = "human";
	    else if(radioElf.isSelected()) race = "elf";
	    else race = "dwarf"; //then must be third one
	    if(radioMale.isSelected()) gender = "male";
	    else gender = "female";
	    name = insertName.getText();
	    System.out.println("Race, gender, name: "+race + " " + gender + " " + name);
    	stage=(Stage) startGame.getScene().getWindow();
	    root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
	    if(event.getSource()==startGame){
		    Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
	    }
	    
	}
	
	@FXML
	private void quitGame(){
		
		Platform.exit();
    	System.exit(0);	    
	}
	
}
