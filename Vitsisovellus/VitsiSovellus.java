package sovellus;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;

public class VitsiSovellus extends Application {
    
    public void start(Stage stage) {
        Button vitsi = new Button("Vitsi");
        Button vastaus = new Button("Vastaus");
        Button selitys = new Button("Selitys");
        Label label = new Label("What do you call a bear with no teeth?");
        BorderPane borderPane = new BorderPane();
        HBox hbox = new HBox();
        
        borderPane.setPrefSize(600, 300);
                
        borderPane.setTop(hbox);
        borderPane.setPadding(new Insets (20, 20, 20, 20));
        hbox.getChildren().addAll(vitsi, vastaus, selitys);
        hbox.setSpacing(200);
        borderPane.setCenter(label);
        
        Scene nakyma = new Scene(borderPane);
        
        vitsi.setOnAction((event) -> label.setText("What do you call a bear with no teeth?"));
        vastaus.setOnAction((event) -> label.setText("A gummy bear."));
        selitys.setOnAction((event) -> label.setText("Worst joke I've ever heard."));
        
        stage.setScene(nakyma);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(VitsiSovellus.class);
        System.out.println("Hello world!");
    }
}
