package application;
	
import java.io.IOException;

import game.GameController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	//GameController gameController;
    	//loadControls("/ui/ActivityChoice.fxml", new GameController());
        Parent root = FXMLLoader.load(getClass().getResource("/ui/StartMenu.fxml"));
        primaryStage.setTitle("Lost Rage");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }/*
    private Node loadControls(String fxml, Initializable controller) throws IOException {
           //URL resource = getClass().getResource(fxml);
           if (getClass().getResource(fxml) == null)
               throw new IllegalArgumentException(fxml + " not found");

           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
           fxmlLoader.setController(controller);
           return fxmlLoader.load();
           
       }*/
}
