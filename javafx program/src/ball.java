import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class ball extends Application{
    public void start(Stage primaryStage)
    {
        Circle btn = new Circle();
        btn.setRadius(30);
        btn.setFill(Color.BLACK);
        Group group = new Group(btn);
        Scene scene = new Scene(group, 600, 600);
        Duration duration = Duration.millis(2500);
        TranslateTransition transition = new TranslateTransition(duration, btn);
        transition.setByX(600);
        transition.setByY(600);
        transition.setAutoReverse(true);
        transition.setCycleCount(30); //circle goes 30 times x to y
        transition.play();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
