import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JanelaJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Exemplo JavaFX");

        // Componentes
        Label label = new Label("Olá, JavaFX!");
        Button button = new Button("Clique aqui");

        // Ação do botão
        button.setOnAction(e -> label.setText("Você clicou no botão!"));

        // Layout
        VBox layout = new VBox(10); // Espaço vertical entre os elementos
        layout.getChildren().addAll(label, button);

        // Cena
        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // inicia a aplicação JavaFX
    }
}