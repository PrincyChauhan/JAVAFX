import javafx.application.Application;
import javafx.scene.Scene;
 import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 import javafx.scene.layout.StackPane;
public class ROTATION extends  Application
{
    public void start(Stage primaryStage)
    {
        Button pc =new Button("PRINCY");
        pc.setStyle("-fx-border-color: yellow");  // border color
        StackPane p= new StackPane();
        p.getChildren().add(pc);
        p.setRotate(45);
        p.setStyle("-fx-border-color: red;-fx-background-color: black");
        Scene scene=new Scene(p,90,90);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rotation");
        primaryStage.show();
    }

}
