import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LojaPrograma extends JFrame {
    private JLabel carrinhoLabel;
    private JTextField itemTextField;
    private JButton adicionarButton;

    private List<String> carrinho;

    public LojaPrograma() {
        setTitle("Loja Programa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        carrinho = new ArrayList<>();

        carrinhoLabel = new JLabel("Carrinho:");
        itemTextField = new JTextField(15);
        adicionarButton = new JButton("Adicionar ao Carrinho");

        add(carrinhoLabel);
        add(itemTextField);
        add(adicionarButton);

        // Adicionando o tratamento de eventos ao botão
        adicionarButton.addActionListener(new AdicionarItemListener());

        pack();
        setVisible(true);
    }

    private class AdicionarItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String item = itemTextField.getText();
            carrinho.add(item);
            atualizarCarrinho();
        }
    }

    private void atualizarCarrinho() {
        StringBuilder carrinhoTexto = new StringBuilder("<html><ul>");
        for (String item : carrinho) {
            carrinhoTexto.append("<li>").append(item).append("</li>");
        }
        carrinhoTexto.append("</ul></html>");
        carrinhoLabel.setText(carrinhoTexto.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LojaPrograma();
            }
        });
    }
}