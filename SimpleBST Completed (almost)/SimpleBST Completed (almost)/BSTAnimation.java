/**
 * From BSTAnimation.java in Listing 25.8 of Introduction to Java, 11th Edition, by Y. Daniel Liang
 * Slightly modified by Yan Zong Ding for ITEC 3150
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.NoSuchElementException;

public class BSTAnimation extends Application {

    SimpleBST tree;
    BTView view;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        tree = new SimpleBST(); // Create a tree
        tree.put(60, 6);
        tree.put(20, 2);
        tree.put(70, 7);
        tree.put(90, 9);
        tree.put(80, 8);
        tree.put(10, 1);
        tree.put(40, 4);
        tree.put(30, 3);
        tree.put(50, 5);

        BorderPane pane = new BorderPane();
        view = new BTView(tree); // Create a View
        pane.setCenter(view);

        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_RIGHT);
        TextField tfValue = new TextField();
        tfValue.setPrefColumnCount(3);
        tfValue.setAlignment(Pos.BASELINE_RIGHT);
        Button btPut = new Button("Put");
        Button btGet = new Button("Get");
        Button btSort = new Button("Sort");
        Button btClearTree = new Button("Clear Tree");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter Key: "),
                tfKey, new Label("Value: "),
                tfValue, btPut, btGet, btSort, btClearTree);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);

        btSort.setOnAction(e -> {
            System.out.println("In Order Traversal: " + tree.inOrder());
        });

        btPut.setOnAction(e -> {
            int key = Integer.parseInt(tfKey.getText());
            int value = Integer.parseInt(tfValue.getText());
            tree.put(key, value);
            view.displayTree();
        });

        btGet.setOnAction(e -> {
            int key = Integer.parseInt(tfKey.getText());
            try {
                System.out.printf("get(%d) = %d\n", key, tree.get(key));
            }
            catch (NoSuchElementException ex) {
                System.out.println(ex.getMessage());
            }
        });


        btClearTree.setOnAction(e -> {
            tfKey.clear();
            tfValue.clear();
            tree = new SimpleBST();
            view = new BTView(tree);
            pane.setCenter(view);
            view.displayTree();
        });

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 1000, 600);
        primaryStage.setTitle("BSTAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        view.displayTree();
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

