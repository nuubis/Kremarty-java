package application;

import game.Character;
import game.HumanCharacter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import game.Inventory;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	
	/* For radio buttons
	 * private String gender;
	private String race;
	private String name;*/
	
	
	//Menu Buttons
	@FXML
	public Button play, load, help, quit, startGame, back;
	//Activity Buttons
	@FXML
	Button craft, explore, gather, mine, village, gameBack, save;
	//Explore Buttons
	@FXML
	Button combat, combatSmallBoss, combatBoss, exploreBack;
	public TextField insertName;
	RadioButton radioHuman, radioElf, radioDwarf, radioMale, radioFemale;
	ToggleGroup Race, Gender;
	ImageView charChoose;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//System.out.println("System working!");
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
	private void changeScene2(MouseEvent event) throws IOException{
		System.out.println("hello");
		Stage stage;
	    Parent root;
	    //System.out.println(event.getSource());
	    //System.out.println(charChoose);
		if (event.getSource()==charChoose){
			System.out.println("I work");
	    	stage=(Stage) charChoose.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CreateCharacter.fxml"));
	    }
	}
	
	@FXML
	private void changeExploreScene(ActionEvent event) throws IOException{
		System.out.println("Explore works");
	    Stage stage; 
	    Parent root;
	    
	    if (event.getSource()==combat){
	    	stage=(Stage) combat.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CombatUI.fxml"));
	    }
	    
	    else if (event.getSource()==combatSmallBoss){
	    	stage=(Stage) combatSmallBoss.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CompatUI.fxml"));
	    }
	    
	    else if (event.getSource()==combatBoss){
	    	stage=(Stage) combatBoss.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/VillageUI.fxml"));
	    }
	    
	    else {
	    	stage=(Stage) exploreBack.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/ExploreUI.fxml"));
	    }
	    
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}
	@FXML
	private void changeGameScene(ActionEvent event) throws IOException{
		System.out.println("Activity works");
	    Stage stage; 
	    Parent root;
	    
	    if (event.getSource()==craft){
	    	stage=(Stage) craft.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/CraftUI.fxml"));
	    }
	    
	    else if (event.getSource()==explore){
	    	stage=(Stage) explore.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/ExploreUI.fxml"));
	    }
	    
	    else if (event.getSource()==gather){
	    	stage=(Stage) gather.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/GatherUI.fxml"));
	    }
	    
	    else if (event.getSource()==mine){
	    	stage=(Stage) mine.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/MineUI.fxml"));
	    }
	    
	    else if (event.getSource()==village){
	    	stage=(Stage) village.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/VillageUI.fxml"));
	    }
	    
	    else if (event.getSource()==save){
	    	stage=(Stage) save.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
	    }
	    
	    else {
	    	System.out.println(gameBack);
	    	stage=(Stage) gameBack.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/ActivityChoice.fxml"));
	    }
	    
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}
	
	@FXML
	private void changeMenuScene(ActionEvent event) throws IOException{
		System.out.println("Menu works");
	    Stage stage; 
	    Parent root;
	    //System.out.println(event.getSource());
	    //System.out.println(play);
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
	    	Character human = new HumanCharacter("Test", "Male", 100, new Inventory(), 10, "Human", 100, 5, 5);
	    	/*RadioButton raceButton = (RadioButton) Race.getSelectedToggle();
	    	RadioButton genderButton = (RadioButton) Gender.getSelectedToggle();
	    	String gender = genderButton.getText();
	    	String race = raceButton.getText();
			String name = insertName.getText();
			System.out.println("Race, gender, name: "+race + " " + gender + " " + name);*/
	    	System.out.println(human.getName());
			
	    	stage=(Stage) startGame.getScene().getWindow();
		    root = FXMLLoader.load(getClass().getResource("/ui/ActivityChoice.fxml"));
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
		System.out.println("System is existing!");
		Platform.exit();
    	System.exit(0);	    
	}
	
}
