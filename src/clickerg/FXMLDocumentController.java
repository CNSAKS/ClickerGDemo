/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickerg;

import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author adpeijar
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lb_goldCount;
    private int gold = 0;
    private int goldPerClick = 1;
    @FXML
    private Pane pn_Mine;
    @FXML
    private Label label_goldPerClick;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pn_Mine.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        label_goldPerClick.setText(goldPerClick+"");
        lb_goldCount.setText(gold+"");
    }    

    @FXML
    private void goldIncrease(MouseEvent event) {
        gold += goldPerClick;
        lb_goldCount.setText(gold+"");
    }

    @FXML
    private void moreGPC(ActionEvent event) {
        goldPerClick++;
        label_goldPerClick.setText(goldPerClick+"");
    }
    
}
