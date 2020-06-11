import javafx.application.Application;
 import javafx.geometry.HPos;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.GridPane;
 import javafx.stage.Stage;
 public class UI_CONTROLS extends Application
 {
 public void start(Stage primaryStage)
 {
         GridPane pane = new GridPane();
         pane.setAlignment(Pos.CENTER);
         pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
         pane.setHgap(5.5);
         pane.setVgap(5.5);
         pane.add(new Label("NAME:"), 0, 0);
         pane.add(new TextField(), 1, 0);
         pane.add(new Label("MAIL-ID:"), 0, 1);
         pane.add(new TextField(), 1, 1);
         pane.add(new Label("PHONE NUMBER:"), 0, 2);
         pane.add(new TextField(), 1, 2);
         Button btAdd = new Button("LOGIN");
         pane.add(btAdd, 1, 3);
         GridPane.setHalignment(btAdd, HPos.RIGHT);
         Scene scene = new Scene(pane);
         primaryStage.setTitle("INFORMATION");
         primaryStage.setScene(scene);
         primaryStage.show();
         }
 }