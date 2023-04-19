/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.*;
import javafx.scene.control.TextArea;

/**
 *
 * @author 1996n
 */
public class DnD_GUI extends Application {
    
    public TextArea outText = new TextArea("Your results here");
    
    @Override
    public void start(Stage primaryStage) {
        
        ComboBox dropDown = new ComboBox();
        dropDown.getItems().addAll(
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        );   
        dropDown.setValue(1); // This gives is our default value for the dropdown menu
        
        Button btn = new Button();
        btn.setText("Generate treasure!");
        btn.setOnAction((ActionEvent event) -> {
            
            System.out.println("Treasure generated!");
            System.out.println("Challenge rating is "+dropDown.getValue().toString());
            
            switch (Integer.parseInt(dropDown.getValue().toString())) {
                case 1:
                    System.out.println("CR 1 selected");
                    outText.setText(tables.cr1());
                    break;
                case 2:
                    System.out.println("CR 2 selected");
                    outText.setText(tables.cr2());
                    break;
                case 3:
                    System.out.println("CR 3 selected");
                    outText.setText(tables.cr3());
                    break;
                case 4:
                    System.out.println("CR 4 selected");
                    outText.setText(tables.cr4());
                    break;
                case 5:
                    System.out.println("CR 5 selected");
                    outText.setText(tables.cr5());
                    break;
                case 6:
                    System.out.println("CR 6 selected");
                    outText.setText(tables.cr6());
                    break;
                case 7:
                    System.out.println("CR 7 selected");
                    outText.setText(tables.cr7());
                    break;
                case 8:
                    System.out.println("CR 8 selected");
                    outText.setText(tables.cr8());
                    break;
                case 9:
                    System.out.println("CR 9 selected");
                    outText.setText(tables.cr9());
                    break;
                case 10:
                    System.out.println("CR 10 selected");
                    outText.setText(tables.cr10());
                    break;
                case 11:
                    System.out.println("CR 11 selected");
                    outText.setText(tables.cr11());
                    break;
                case 12:
                    System.out.println("CR 12 selected");
                    outText.setText(tables.cr12());
                    break;
                case 13:
                    System.out.println("CR 13 selected");
                    outText.setText(tables.cr13());
                    break;
                case 14:
                    System.out.println("CR 14 selected");
                    outText.setText(tables.cr14());
                    break;
                case 15:
                    System.out.println("CR 15 selected");
                    outText.setText(tables.cr15());
                    break;
                case 16:
                    System.out.println("CR 16 selected");
                    outText.setText(tables.cr16());
                    break;
                case 17:
                    System.out.println("CR 17 selected");
                    outText.setText(tables.cr17());
                    break;
                case 18:
                    System.out.println("CR 18 selected");
                    outText.setText(tables.cr18());
                    break;
                case 19:
                    System.out.println("CR 19 selected");
                    outText.setText(tables.cr19());
                    break;
                case 20:
                    System.out.println("CR 20 selected");
                    outText.setText(tables.cr20());
                    break;
                
                default:
                    outText.setText("I'm afraid I haven't coded that far just yet.");
            }
        });
        
        outText.setWrapText(true);
        
        Text crText = new Text("Enter CR:");
        //Text outText = new Text("Your results here" + out);
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(crText, dropDown, btn);
        hbox.setSpacing(5);
        /*
        StackPane root = new StackPane();
        root.getChildren().add(hbox);
        */
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox, outText);
        
        Scene scene = new Scene(vbox, 500, 250);
        
        primaryStage.setTitle("D&D 3.5 Treasure Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
