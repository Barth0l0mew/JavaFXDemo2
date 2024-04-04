package Sample2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField outputC;

    @FXML
    private Button result;

    @FXML
    void clickResult(ActionEvent event) {
        outputC.setText(String.valueOf(Integer.parseInt(inputA.getText())
                +Integer.parseInt(inputB.getText())));
    }

}
