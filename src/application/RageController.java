package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RageController implements Initializable {
	
	@FXML
	public Button play, back;
	
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
	     else{ // if (event.getSource()==back)
	       stage=(Stage) back.getScene().getWindow();
	       root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
	     }
	     //create a new scene with root and set the stage
	     Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();
	     }
	
	
	
}
