import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipTaxTotalController 
{
    @FXML 
    private Button calcButton;

    @FXML 
    private TextField totalPrompt;
    
    @FXML 
    private Label calcLabel;
    
    @FXML 
    private Label disclosureLabel;

    @FXML 
    private Label tipLabel;

    @FXML 
    private Label taxLabel;
    
    @FXML 
    private Label totalLabel;

    // This method is called when the FXML file is loaded
    public void initialize() 
    {
        // Perform any necessary initialization here.
    }
    
    // Event listener for the convertButton
    public void calculatetButtonListener() 
    { 
      //Named constants for tip and tax
        final double TIP = 0.18;
        final double TAX = 0.07;
        
      //Get the charge from TextField
      String strCharge = totalPrompt.getText();
      
      //Calculate the tax, tip, and total
      double charge = Double.parseDouble(strCharge);
      double tipAmount = charge * TIP;
      double taxAmount = charge * TAX;
      double totalAmount = tipAmount + taxAmount + charge;
      
      //Display the tip amount in the tipLabel
      tipLabel.setText(String.format("Tip: $%,.2f", tipAmount));
      
      //Display the tax amount in the taxLabel
      taxLabel.setText(String.format("Tax: $%,.2f", taxAmount));
      
      //Display the total amount in the totalLabel
      totalLabel.setText(String.format("Total: $%,.2f", totalAmount));
   }
}
