package SWE205P;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class helpingclass {
	public void displayalertbox(String title, String text){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		Label l = new Label(text);
		Button ok = new Button("OK");
		ok.setPrefSize(50, 20);
		ok.setOnAction(e -> window.close());
		VBox v = new VBox();
		v.setSpacing(10);
		v.setAlignment(Pos.CENTER);
		v.getChildren().addAll(l,ok);
		Scene scene = new Scene(v,400,70);
		window.setScene(scene);
		window.showAndWait();

	}
	public void closewindow(){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Closing program");
		Label l = new Label("Are you sure you want to close the program?");
		Button yes = new Button("Yes");
		Button no = new Button("No");
		yes.setOnAction(e ->{
			System.exit(0);
		});
		no.setOnAction(e ->{
			window.close();;
		});
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(10);
		HBox h = new HBox();
		yes.setPrefSize(50, 30);
		no.setPrefSize(50, 30);
		h.setSpacing(30);
		h.setAlignment(Pos.BASELINE_CENTER);
		h.getChildren().addAll(yes,no);
		grid.add(l, 0, 0);
		grid.add(h, 0, 1);
		Scene scene = new Scene(grid,250,70);
		window.setResizable(false);
		window.setScene(scene);
		window.showAndWait();
	}
}
