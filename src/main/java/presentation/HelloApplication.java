package presentation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloApplication extends Application {

    Button button;

    @Override
    public void start(Stage stage) throws IOException {
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 320, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        button = new Button("Epic text");
        button.setOnAction(e -> {
            System.out.println("test");
        });
        layout.getChildren().add(button);
    }

    public static void main(String[] args) {
        launch();
    }


}