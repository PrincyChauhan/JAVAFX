//import com.sun.glass.ui.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class JAVAFX  extends Application
{
    public void start(Stage primaryStage)
    {
        Button pc =new Button("PRINCY");
        Scene scene =new Scene(pc,200,250);
        primaryStage.setTitle("MY FIRST JAVAFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
