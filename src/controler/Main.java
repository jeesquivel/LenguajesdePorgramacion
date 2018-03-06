package controler;

import domain.Library;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/initView.fxml"));
        primaryStage.setTitle("Sistema BiblioTech");
        primaryStage.setScene(new Scene(root, 800, 600));



        // definicion de la biblioteca

        Library BiblioTech= new Library("Biblioteca");





        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
