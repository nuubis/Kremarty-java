package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	
	private String gender;
	private String race;
	private String name;
	
	@FXML
	public Button play, load, help, quit, startGame, back;
	public TextField insertName;
	RadioButton radioHuman, radioElf, radioDwarf, radioMale, radioFemale;
	ToggleGroup Race, Gender;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("System working!");
	}
	
	@FXML
	private void handleButtons(ActionEvent event){
		System.out.println("Radio is on!");
		Race.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
        @Override
        public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1)
            {
            RadioButton chk = (RadioButton)t1.getToggleGroup().getSelectedToggle(); // Cast object to radio button
            System.out.println("Selected Radio Button - "+chk.getText());
            }
        });
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
	    else if(event.getSource()==startGame){
	    	/*RadioButton raceButton = (RadioButton) Race.getSelectedToggle();
	    	RadioButton genderButton = (RadioButton) Gender.getSelectedToggle();
	    	String gender = genderButton.getText();
	    	String race = raceButton.getText();
			String name = insertName.getText();
			System.out.println("Race, gender, name: "+race + " " + gender + " " + name);*/
			
	    	stage=(Stage) startGame.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
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
	
	
	
	
	
	
	@FXML
	private void quitGame(){
		
		Platform.exit();
    	System.exit(0);	    
	}
	
}
