import javafx.application.Application;
  import javafx.scene.Scene;
  import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
  import javafx.geometry.Insets;
  import javafx.stage.Stage;
  import javafx.scene.image.Image;
  import javafx.scene.image.ImageView;
    public class IMAGE extends Application {
        public void start(Stage primaryStage) {
             Pane pane = new HBox(10);
             pane.setPadding(new Insets(5, 5, 5, 5));
             Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSv__5LOxnQ-1CnzBBr5dw6_qE2aHnLlNTkXx5Vkknin-gRTT8v&usqp=CAU");
             pane.getChildren().add(new ImageView(image));
             Scene scene = new Scene(pane);primaryStage.setTitle("PRINCY CHAUHAN");
         primaryStage.setScene(scene);
         primaryStage.show();
         }
 }

