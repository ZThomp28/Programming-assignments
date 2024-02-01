import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HelloWorldFx extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Create a circle
		Circle circle = new Circle(50);
		circle.setFill(Color.LIGHTSEAGREEN);

		// Create a button
		Button btn = new Button("Hello World");

		// Handle the event of firing the button
		// Define the button's action which is invoked when the button is fired,
		// for example, when a user clicks the button with a mouse.
		btn.setOnAction(e -> System.out.println("Hello World"));

		// Create a stack pane and add the circle and button in this order to the pane
		StackPane root = new StackPane();
		root.getChildren().addAll(circle, btn);

		// Create a scene from stack pane
		Scene scene = new Scene(root, 500, 300);

		// Place the scene on the stage and display the stage
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
