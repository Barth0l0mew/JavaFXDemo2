package Sample1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;

public class Sample1 extends Application {
    @FXML
    public Button fxButton;
    public Button result;
    public TextField inputA;
    public TextField inputB;
    public TextField outputC;

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = getClass().getResource("/sample3.fxml");
//        System.out.println(this.getClass().getResource("/sample1.fxml"));
        System.out.println(url);
        Parent root = FXMLLoader.load(getClass().getResource("/sample1.fxml")); //Без слеша не работает
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show  ();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void click(ActionEvent actionEvent) {
        System.out.println("Hello World");
        fxButton.setText("Hey!");
    }
    public void clickResult (ActionEvent actionEvent){
        System.out.println("hi");
    }
}