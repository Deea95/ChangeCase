package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Main_Controller.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(
                getClass().getResource("/sample/BaseStructure.css").toExternalForm());
        stage.setScene(scene);
        scene.getStylesheets().add(
                getClass().getResource("/sample/green-theme.css").toExternalForm());
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Change Case");
        stage.getIcons().add(new Image(getClass()
                .getResourceAsStream("/sample/change-case.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
