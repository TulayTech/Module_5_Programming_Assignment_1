/*
 * Chapter 14 - JavaFX
 * Programming Exercise 14.1 - Display images in a GridPane

 * Program Description:
 * This program displays four flag images in a 2×2 grid layout using JavaFX.
 * The images are:
 *   - flag1.gif (American flag)
 *   - flag2.gif (British flag)
 *   - flag6.gif (French flag)
 *   - flag7.gif (Chinese flag)
 *
 * Each image is loaded as a JavaFX Image object, wrapped in an ImageView,
 * and added to a GridPane. The GridPane is then placed in a Scene and shown
 * in the primary Stage.
 */


import javafx.application.Application;        // Base class for all JavaFX apps
import javafx.stage.Stage;                   // The main window (top-level container)
import javafx.scene.Scene;                   // Holds all content for a stage
import javafx.scene.image.Image;             // Represents an image
import javafx.scene.image.ImageView;         // Node used to display an Image
import javafx.scene.layout.GridPane;         // A layout that arranges nodes in rows and columns
import javafx.geometry.Insets;               // For padding around the grid
import javafx.geometry.Pos;                  // For alignment of the grid


public class Exercise14_01 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creates a GridPane container
        GridPane gridPane = new GridPane();

        // Add spacing between rows and columns
        gridPane.setHgap(10);   // Horizontal gap between columns
        gridPane.setVgap(10);   // Vertical gap between rows

        // Add padding around the entire grid
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Center the grid on the scene
        gridPane.setAlignment(Pos.CENTER);

        // Load images
        Image imgUSA    = new Image("src/images/flag1.gif"); // American flag
        Image imgUK     = new Image("src/images/flag2.gif"); // British flag
        Image imgFrance = new Image("src/images/flag6.gif"); // French flag
        Image imgChina  = new Image("src/images/flag7.gif"); // Chinese flag

        // Wrap images in ImageView node
        ImageView ivUSA    = new ImageView(imgUSA);
        ImageView ivUK     = new ImageView(imgUK);
        ImageView ivFrance = new ImageView(imgFrance);
        ImageView ivChina  = new ImageView(imgChina);
    }
}
