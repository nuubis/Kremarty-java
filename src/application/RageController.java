package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RageController implements Initializable {
	
	@FXML
	public Button play;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("System working!");
	}
	
	@FXML
	public void kontroll(){
		System.out.println("I work!");
	}
	
	
}
