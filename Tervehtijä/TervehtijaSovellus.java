package sovellus;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class TervehtijaSovellus extends Application {

    public void start(Stage stage) throws Exception {
        Label ylin = new Label("Kirjoita nimesi ja aloita.");
        TextField textField = new TextField();
        Button aloita = new Button("Aloita");
        BorderPane eka = new BorderPane();
        BorderPane toka = new BorderPane();
        VBox laatikko = new VBox();
        Label tervetuloa = new Label();
        
        Scene ekaNakyma = new Scene(eka);
        Scene tokaNakyma = new Scene(toka);
        
        laatikko.getChildren().addAll(ylin, textField, aloita);
        laatikko.setSpacing(10);
        eka.setPadding(new Insets(20, 20, 20, 20));
        toka.setPadding(new Insets(20, 20, 20, 20));
        
        eka.setCenter(laatikko);
        toka.setCenter(tervetuloa);
        toka.setPrefSize(300, 150);
        
        
        aloita.setOnAction((event) -> {
            stage.setScene(tokaNakyma);
            tervetuloa.setText("Tervetuloa " + textField.getText() + "!");
        });
        
        
        stage.setScene(ekaNakyma);
        stage.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
        System.out.println("Hellow world!");

    }
}
