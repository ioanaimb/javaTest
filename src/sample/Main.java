package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    Scene scena1, scena2;
    Stage window;
    Button button1,button2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        // Adauga label prima scena
        Label label1 = new Label("Asta e prima scena");
        Label label2 = new Label("Asta e a doua scena");
        // Adauga buton prima scena
        Button button1 = new Button();
        button1.setText("Mergi la scena 2");
        button1.setOnAction(e -> window.setScene(scena2));

        Button button2 = new Button();
        button2.setText("Mergi la scena 1");
        button2.setOnAction(e -> window.setScene(scena1));
        // Adauga layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        layout1.setAlignment(Pos.CENTER);

        VBox layout2 = new VBox(30);
        layout2.getChildren().addAll(label2, button2);
        layout2.setAlignment(Pos.CENTER);
        //Adauga scena
        scena1 = new Scene(layout1, 200, 200);
        scena2 = new Scene(layout2, 400, 400);
        primaryStage.setScene(scena1);
        primaryStage.setTitle("Titlu");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
