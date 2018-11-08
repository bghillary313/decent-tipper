/* CIT249- Module 8: TipTaxTotal Calulator
 * Meal total calculator program 
 * Hillary Slaughter
 * 11/3/18
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;   
import javafx.stage.Stage;

public class TipTaxTotal extends Application 
{ 
   public void start(Stage stage) throws Exception
   {  
      // Load the FXML file.
      Parent parent = FXMLLoader.load(
               getClass().getResource("TipTaxTotal.fxml")); 
      
      // Build the scene graph.
      Scene scene = new Scene(parent); 
      
      // Display our window, using the scene graph.
      stage.setTitle("Meal Total Calculator"); 
      stage.setScene(scene);
      stage.show(); 
   }
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
 } 