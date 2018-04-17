/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickerg.Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author adpeijar
 */
public class Main extends Application {

    @FXML
    private Button bt_gold;
    @FXML
    private Button bt_boss;
    @FXML
    private Button bt_exp;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Gold.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private void clickGold(ActionEvent event) {
    }

    @FXML
    private void clickBoss(ActionEvent event) {
    }

    @FXML
    private void clickExp(ActionEvent event) {
    }
    
}
