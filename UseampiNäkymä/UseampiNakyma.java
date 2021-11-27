package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class UseampiNakyma extends Application {
    
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        VBox verticalBox = new VBox();
        GridPane gridPane = new GridPane();
        
        Button ekaNappi = new Button("Tokaan näkymään!");
        Label ylaLaita = new Label("Eka näkymä!");
        Button tokaNappi = new Button("Kolmanteen näkymään!");        
        Label tokaLabel = new Label("Toka näkymä!");
        Label kolmasLabel = new Label("Kolmas nakyma");
        Button kolmasNappi = new Button("Ekaan nakymaan");
        
        Scene ekaNakyma = new Scene(borderPane);
        Scene tokaNakyma = new Scene(verticalBox);
        Scene kolmasNakyma = new Scene(gridPane);
       
        borderPane.setTop(ylaLaita);
        borderPane.setCenter(ekaNappi);
        
        ekaNappi.setOnAction((event) -> {
            stage.setScene(tokaNakyma);
        });
        
        verticalBox.setSpacing(10);
        verticalBox.getChildren().addAll(tokaNappi, tokaLabel);
        
        tokaNappi.setOnAction((event) -> {
            stage.setScene(kolmasNakyma);
        });
        
        gridPane.add(kolmasLabel, 1, 0);
        gridPane.add(kolmasNappi, 1, 1);
        
        kolmasNappi.setOnAction((event) -> {
            stage.setScene(ekaNakyma);
        });
        
        stage.setScene(ekaNakyma);
        stage.show();

    }

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
        System.out.println("Hello world!");
    }

}
