import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
public class CIRCLE extends Application
{
    public void start(Stage primaryStage)
    {
        Circle c= new Circle();
        c.setCenterX(100);
        c.setCenterY(100);
        c.setRadius(50);
        c.setStroke(Color.RED); // change the circle's border color
        c.setFill(Color.BLUE);
        Pane P=new Pane();
        P.getChildren().add(c);
        Scene scene=new Scene(P,200,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("circle ");
        primaryStage.show();
    }
}
