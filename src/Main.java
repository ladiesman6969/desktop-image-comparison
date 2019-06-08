import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        primaryStage.setTitle("Image Comparison - For more info go to github.com/ladiesman6969/desktop-image-comparison");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        mainStage = primaryStage;
    }

    public static Stage mainStage;


    public static void main(String[] args) {
        launch(args);
    }
}
