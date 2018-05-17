package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/*
 *
 *
 * @author cdea
 */
public class HelloWorldMain extends Application {
	/*
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250);
		Button btn = new Button();
		btn.setLayoutX(100);
		btn.setLayoutY(80);
		btn.setText("clik to view id");
		final int i = 1;
		btn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out
						.println("Hello World" + "this is your" + i + "click");
			}
		});
		root.getChildren().add(btn);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}