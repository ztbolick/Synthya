package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("SynthYaV1.3");
        Scene guiStart = new Scene(root, 850,410);
        primaryStage.setScene(guiStart);
        primaryStage.setResizable(false);



        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);


    }




}
