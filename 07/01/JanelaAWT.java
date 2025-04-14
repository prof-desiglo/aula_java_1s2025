import java.awt.*;
import java.awt.event.*;

public class JanelaAWT {

    public static void main(String[] args) {
        // Criando a janela (frame)
        Frame frame = new Frame("Exemplo de Janela com AWT");

        // Criando o rótulo (label) e o botão (button)
        Label label = new Label("Olá, AWT!");
        Button button = new Button("Clique aqui");

        // Definindo o layout da janela (layout simples)
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        // Ação do botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Você clicou no botão!");
            }
        });

        // Definindo o tamanho da janela
        frame.setSize(300, 150);
        
        // Tornando a janela visível
        frame.setVisible(true);

        // Adicionando o evento de fechamento da janela
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Fecha a aplicação ao clicar no 'X'
            }
        });
    }
}