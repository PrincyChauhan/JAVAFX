import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.util.Stack;

public class checkbox extends Application
{
    public void start(Stage primaryStage)
    {
        Label l = new Label("Friends");
        CheckBox cb1=new CheckBox("PRINCY");
        CheckBox cb3=new CheckBox("HIRAL");
        CheckBox cb4=new CheckBox("HENCY");
        HBox h=new HBox();
        //VBox v=new VBox();
        //v.getChildren().addAll(l,cb1,cb4,cb3);
        h.getChildren().addAll(l,cb1,cb4,cb3);
        Scene scene=new Scene(h,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FRIENDS");
        primaryStage.show();
    }
}
