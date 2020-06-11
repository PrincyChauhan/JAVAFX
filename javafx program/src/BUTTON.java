import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class BUTTON extends Application{
    public  void start(Stage primaryStage)
    {
        StackPane pane= new StackPane();
        pane.getChildren().add(new Button("ok"));
        Scene scene=new Scene(pane,200,50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
