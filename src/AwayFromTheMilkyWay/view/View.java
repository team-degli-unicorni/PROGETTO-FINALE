/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AwayFromTheMilkyWay.view;

import AwayFromTheMilkyWay.controller.ControllerForView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author giorg
 */
public class View implements IView{
    
    private Stage stage;
    private static View instance;
    private GameWindow game;
    private Scene scene;
    Stage pauseStage;
        
    
    
    public View(){
        stage = new Stage();
    }
      
           
    public static IView getInstance() {
        if(instance == null)
            instance = new View();
        return instance;
    }
    
    public void closeWindow(){
        if(this.stage != null){
            
            this.stage.close();
            this.stage = null;
        }
    
    }
    
   
    //metodi per switchare le scene
    
    @Override
    public void changeCurrentWindow(String window) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource(window));
    
        scene = new Scene(root, 1280, 800);
    
        stage.setTitle("Away From the Milky Way");
        stage.setScene(scene);
        stage.show();
        
        
    
    
    }
    
    @Override
    public void openGameWindow(int level){
        
        try {//il try catch va chiamato perche il metodo game.composegamewindow ha la clausola throws IOexeption
            game = new GameWindow();
            game.composeWindow(level);
            scene = new Scene(game, 1280, 900);
            ControllerForView.getInstance().startMovimento();
            
            stage.setTitle("Away From the Milky Way");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    @Override
    public void pause(){
        ControllerForView.getInstance().pauseAnimations();
        pauseStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("opzioniPausa.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        scene = new Scene(root, 1280, 800);
        
        pauseStage.setScene(scene);
        pauseStage.setResizable(false);
        pauseStage.setTitle("Opzioni");
        pauseStage.initStyle(StageStyle.UNDECORATED);
        stage.hide();
        pauseStage.show();
        
    
    }
    
   
    //metodi per restituire oggetti relativi alla finestra
    
    @Override
    public GameWindow getGameWindow(){
        return this.game;
    }
    
    
    @Override
    public Stage getPauseStage(){
        return this.pauseStage;
    }
    
    
    @Override
    public Stage getMainStage(){
        return this.stage;
    }
    
    
    @Override
    public Scene getScene(){
        return this.scene;
    }
    
   
 
    
    
}//end class
