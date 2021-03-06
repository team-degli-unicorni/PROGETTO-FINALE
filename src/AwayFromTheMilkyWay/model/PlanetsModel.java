
package AwayFromTheMilkyWay.model;

import AwayFromTheMilkyWay.utils.Utils;
import java.io.IOException;
import javafx.scene.shape.Circle;


public class PlanetsModel {
    private Circle pl1;
    private Circle pl2;
    private Circle pl3;
    private Circle pl4;
    private Circle[] a = new Circle[4];
    
    public PlanetsModel(){}
    
    public Circle[] scanning(int level) throws IOException{
       if(level == 1){
                      pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet1Radius")));
                      
                      pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet2Radius")));
                
                      pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet3Radius")));
                
                      pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level1.txt", "planet4Radius")));
                
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
                      
        }else if(level == 2){           
                        pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet1Radius")));
                      
                        pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet2Radius")));
                        
                         pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet3Radius")));
                
                        pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level2.txt", "planet4Radius")));
                
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
        
            
        
        }else if(level == 3){           
                        pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet1Radius")));
                      
                        pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet2Radius")));
                        
                        pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet3Radius")));
                      
                        pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level3.txt", "planet4Radius")));
                
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
           
            
        
        }else if(level == 4){           
                        pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet1Radius")));
                      
                        pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet2Radius")));
                
                        pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet3Radius")));
                      
                        pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level4.txt", "planet4Radius")));
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
          
            
        
       
        }else if(level == 5){           
                    pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet1Radius")));
                      
                      pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet2Radius")));
                
                      pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level5.txt", "planet3Radius")));
                      
                      
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = null;
                      return a;
        }else if(level == 6){           
                      pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet1Radius")));
                      
                      pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet2Radius")));
                
                      pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet3Radius")));
                      
                      pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level6.txt", "planet4Radius")));
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
        }else if(level == 7){           
                      pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet1Radius")));
                      
                      pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet2Radius")));
                
                      pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet3Radius")));
                      
                      pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level7.txt", "planet4Radius")));
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
        }else if(level == 8){           
                      pl1 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet1X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet1Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet1Radius")));
                      
                      pl2 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet2X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet2Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet2Radius")));
                
                      pl3 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet3X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet3Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet3Radius")));
                      
                      pl4 = new Circle(Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet4X")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet4Y")),
                                           Double.parseDouble(Utils.getInstance().searchWord("txtFiles/Level8.txt", "planet4Radius")));
                      a[0] = pl1;
                      a[1] = pl2;
                      a[2] = pl3;
                      a[3] = pl4;
                      return a;
        }             
            
        
       return a;
    }
    
}
