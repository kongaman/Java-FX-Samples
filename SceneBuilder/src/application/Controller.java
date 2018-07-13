package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Button btn1;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    private Label label1;

    @FXML
    void changeColor(ActionEvent event) {
    	label1.setTextFill(Color.RED);
    }

}
