import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label mensagemLabel;

    @FXML
    protected void onHelloButtonClick() {
        mensagemLabel.setText("Você clicou no botão!");
    }
}
