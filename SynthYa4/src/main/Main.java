package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GuiFX.fxml"));

        primaryStage.setTitle("SynthYa4");
        Scene gui = new Scene(root, 700, 400);

        String css = this.getClass().getResource("/main/syle.css").toExternalForm();
        gui.getStylesheets().add(css);
        primaryStage.setScene(gui);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
