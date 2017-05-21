package game;

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

public class GameController implements Initializable{
	
	@FXML
	private Button save, back;
	
	public GameController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ui/ActivityChoice.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("System working!");
	}
	
	@FXML
	private void changeScene(ActionEvent event) throws IOException{
		System.out.println("I work");
	    Stage stage; 
	    Parent root;
	    if(event.getSource()==save){
	       //get reference to the button's stage         
	       stage=(Stage) save.getScene().getWindow();
	       //load up OTHER FXML document
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
}
