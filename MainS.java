package SWE205P;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
public class MainS extends Application{
	public static void main(String[] args){
		launch(args);
	}
	// to select controller fx:controller="SWE205P.Classname"
	@Override
	public void start(Stage primarystage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("StudentSystem.fxml"));
		primarystage.setTitle("Registration services - Student System");
		primarystage.setScene(new Scene(root));
		primarystage.show();
	}
}
