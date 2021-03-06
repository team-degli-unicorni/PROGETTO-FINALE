
package AwayFromTheMilkyWay.controller;


import AwayFromTheMilkyWay.utils.Resources;
import AwayFromTheMilkyWay.view.View;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class AwayFromTheMilkyWay extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
       System.out.println(Font.loadFont(Resources.class.getResource("media/images/mistral.ttf").toExternalForm(), 10)); 
       View.getInstance().changeCurrentWindow("schermataIniziale.fxml");
       Resources.Music.SOUNDINTRO.play();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
