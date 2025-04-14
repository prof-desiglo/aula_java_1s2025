import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaExemplo {
    public static void main(String[] args) {
        // Criação da janela (frame)
        JFrame frame = new JFrame("Exemplo de Janela Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null); // layout absoluto (sem gerenciador de layout)

        // Criação de um rótulo (label)
        JLabel label = new JLabel("Olá, mundo!");
        label.setBounds(50, 30, 300, 30); // x, y, largura, altura
        frame.add(label);

        // Criação de um botão
        JButton button = new JButton("Clique aqui");
        button.setBounds(50, 80, 150, 30);
        frame.add(button);

        // Ação do botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Você clicou no botão!");
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
