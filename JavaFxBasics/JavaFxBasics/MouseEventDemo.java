import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();

        // Create a circle
        Circle circle = new Circle(100, 100, 30);
        circle.setFill(Color.LIGHTSEAGREEN);

        // Handle the event of pressing and dragging a mouse on the circle
        // Define a function to be invoked when a mouse is pressed on the circle and then dragged
        circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });

        // Add the circle to the pane
        pane.getChildren().add(circle);

        // Create a scene and place it on the stage
        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setTitle("MouseEventDemo2"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene on the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

