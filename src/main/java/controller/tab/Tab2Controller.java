package controller.tab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import controller.MainController;

public class Tab2Controller {

    private MainController main;

    @FXML
    public Label lbl2;
    @FXML
    private TextField txt2;
    @FXML
    private Button btn2Save;
    @FXML
    private Button btn2Load;

    @FXML
    public void initialize() {
        System.out.println("----------------------");
        System.out.println("Tab2Controller started");

        System.out.println("lbl2: "+lbl2);
        System.out.println("txt2: "+txt2);
        System.out.println("btn2Save: "+btn2Save);
        System.out.println("btn2Load: "+btn2Load);
    }

    @FXML
    private void btn2SaveClicked(ActionEvent event) {
        System.out.println("------------------");
        System.out.println("Btn 2 save clicked");

        lbl2.setText(txt2.getText());
    }

    @FXML
    private void btn2LoadClicked(ActionEvent event) {
        System.out.println("------------------");
        System.out.println("Btn 2 load clicked");
        lbl2.setText(main.loadLblTextFromTab1());
    }

    public void init(MainController mainController) {
        main = mainController;
    }
}
