package hust.soict.hedspi.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));
		Scene scene = new Scene(root);
		arg0.setTitle("Painter");
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
