package sample;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.text.LabelView;

/**
 * Created by Ioana on 2017-09-20.
 */
public class AlertBox {
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(300);

        Label label = new Label();
        label.setText(message);
        Button button = new Button("Inchide");
        button.setOnAction(e->window.close());

        VBox layout = new VBox(50);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
