import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class combobox extends Application
{
    public void start(Stage primaryStage)
    {
        ComboBox cb1=new ComboBox();

        cb1.getItems().add("Princy");
        cb1.getItems().add("Hiral");
        cb1.getItems().add("Hency");
        cb1.getItems().add("Presha");
        cb1.getItems().add("Bhoomi");
        StackPane p =new StackPane();
        p.getChildren().add(cb1);
        Scene s=new Scene(p,100,100);
        primaryStage.setScene(s);
        primaryStage.setTitle("FRIENDS");
        primaryStage.show();
    }
}
