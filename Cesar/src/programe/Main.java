package programe;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application{

	public static void main(String[] args) {
		System.out.println("Application launched");
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/interface.fxml"));
		fxmlLoader.load();
		Parent root = fxmlLoader.getRoot();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
	}
}
