
package AwayFromTheMilkyWay.view;


import AwayFromTheMilkyWay.utils.Resources;
import AwayFromTheMilkyWay.utils.Utils;
import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class PlayerDataPane extends GridPane {
    private int level, rimbalziEff,rimbalziDes;
    private String name, originalName;
    private ProgressBar pb;
    private Timeline t ;
    private Label nome,rimbalziEffettuati,rimbalziDesiderati,numLivello;
    private Button opzioni;

    private static final String RED_BAR    = "red-bar";
    private static final String YELLOW_BAR = "yellow-bar";
    private static final String GREEN_BAR  = "green-bar";
    private static final String[] BCS = { RED_BAR, YELLOW_BAR, GREEN_BAR };
    
  
  public PlayerDataPane(){
        super();
    }
    
    public void populatePane(){

        rimbalziDesiderati = new Label("RIMBALZI DESIDERATI: " + rimbalziDes);
        rimbalziDesiderati.setPrefSize(426.7, 90);
        rimbalziDesiderati.setAlignment(Pos.CENTER);
        rimbalziDesiderati.setId("rimbDes");
        
        nome  = new Label("NOME: " + name);
        nome.setPrefSize(426.7, 90);
        nome.setAlignment(Pos.CENTER);
        nome.setId("nome");

        pb = new ProgressBar();
        pb.setPrefSize(200, 40);//dimensioni della barra
        pb.setMaxWidth(200);
        pb.setProgress(0);
        pb.progressProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double progress = newValue == null ? 0 : newValue.doubleValue();
                if (progress < 0.5) {
                    setBarStyleClass(pb, GREEN_BAR);
                } else if (progress < 0.8) {
                    setBarStyleClass(pb, YELLOW_BAR);
                } else {
                    setBarStyleClass(pb, RED_BAR);
                }
            }
            private void setBarStyleClass(ProgressBar bar, String barStyleClass) {
                bar.getStyleClass().removeAll(BCS);
                bar.getStyleClass().add(barStyleClass);
            }
        });    
        
        final VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().setAll(pb);
        layout.setId("forza");
        
        rimbalziEffettuati = new Label("RIMBALZI EFFETTUATI: " + rimbalziEff);
        rimbalziEffettuati.setPrefSize(426.7, 90);
        rimbalziEffettuati.setAlignment(Pos.CENTER);
        rimbalziEffettuati.setId("rimbEff");
        
        numLivello = new Label("LIVELLO NUMERO: " + level);
        numLivello.setPrefSize(426.7, 90);
        numLivello.setAlignment(Pos.CENTER);
        numLivello.setId("liv");
        
        opzioni = new Button("OPZIONI");
        opzioni.setPrefSize(426.7, 90);
        opzioni.setOnAction(event -> {
            View.getInstance().pause();
        });
        opzioni.setOnMouseEntered(event -> {
            Resources.SoundEffects.BUTTONCLICK.play();
        });
        opzioni.setId("opz");
        
        this.add(numLivello,0,0);
        this.add(layout,0,1);
        this.add(rimbalziDesiderati,1,0);
        this.add(rimbalziEffettuati,1,1);
        this.add(nome,2,0);
        this.add(opzioni,2,1);      
    }
    
    
    public void adaptToLevel(int level) throws IOException{
        switch (level) {
            case 1:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level1.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 2:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level2.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 3:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level3.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 4:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level4.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 5:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level5.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 6:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level6.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 7:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level7.txt", "rimbalziDes")));
                setLevel(level);
                break;
            case 8:
                setRimbDes(Integer.parseInt(Utils.getInstance().searchWord("txtFiles/Level8.txt", "rimbalziDes")));
                setLevel(level);
                break;
            default:
                break;
        }
    }
    
    
    public void fillGrid(){
        this.getStylesheets().add(getClass().getResource("grafica.css").toExternalForm());
    }
     
    
    public void setName(String nm){
        this.originalName = nm;
        this.name = nm.toUpperCase();
        update();
    }
    
    public void setRimbDes(int n){
        this.rimbalziDes = n;
        update();
    }
    
    public void setRimbalziEff(int rimb){
        this.rimbalziEff = rimb;
        update();
    }
    
    public void setLevel(int l){
        this.level = l;
        update();
    }
 
    
    public double getProgressPB(){
        return pb.getProgress();
    }
    
    
    public int getRimbDes(){
        return this.rimbalziDes;
    }
    
     
    public String getNome(){
        return this.originalName;
    }    
    
    
    
    public void disableButton(){
        this.opzioni.setDisable(true);
    }
    
    
    public void enableButton(){
        this.opzioni.setDisable(false);
    }
   
    
    public void setPB(double progress){
        this.pb.setProgress(progress);
    }
    
    public void startPB(){
        pb.setProgress(0);
        t = new Timeline(new KeyFrame(
                Duration.seconds(0.1), // ogni quanto va chiamata la funzione
                x -> setPB((pb.getProgress()+0.1)%1)
                
        ));
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }
    
    
    public void stopPB(){
        t.stop();
    }
    
    
    public void update(){
        nome.setText("NOME: " + name);
        rimbalziDesiderati.setText("RIMBALZI DESIDERATI: "+ rimbalziDes);
        rimbalziEffettuati.setText("RIMBALZI EFFETTUATI: "+ rimbalziEff);
        numLivello.setText("LIVELLO NUMERO "+ level);
       
    }
    
}
