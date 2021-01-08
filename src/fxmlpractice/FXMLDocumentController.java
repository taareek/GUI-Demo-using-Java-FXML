 
package fxmlpractice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class FXMLDocumentController implements Initializable {
    
    @FXML private CheckBox chickenCheckbox;
    @FXML private CheckBox fishCheckbox;
    @FXML private CheckBox beefCheckbox;
    @FXML private Label orderFoodLabel;
    @FXML
    private VBox orderFood;
    @FXML
    private Label dinnerMenu;
    @FXML
    private Button orderFoodButton;
    //This goes for Choice Box
    @FXML
    private Button buttonClick;
    @FXML
    private Label choiceBoxLabel;
    @FXML
    private ChoiceBox choiceBox;
    
    @FXML
    public void orderFoodButtonOnClick(){
        String order = "Your orders are: ";
        if(fishCheckbox.isSelected())
            order += "\nFish";
        if(chickenCheckbox.isSelected())
            order += "\nChicken";
        if(beefCheckbox.isSelected())
            order += "\nBeef";
        this.orderFoodLabel.setText(order);
    }
    @FXML
    private void choiceBoxOnAction(ActionEvent event) {
       choiceBoxLabel.setText("Your Favourite fruit is: \n"+choiceBox.getValue().toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        orderFoodLabel.setText("");
        // Configuring the choiceBox
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Orange");
        choiceBox.getItems().addAll("Watermelon","Strawberry", "Grapes");
        choiceBox.setValue("Apple");
        
    }    


    
}
