import javax.swing.*;
import java.awt.Color;
public class programadelogin {
    public static void main(String[] args) {
        JFrame frame = null;
        frame = new JFrame("Login !!");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        JLabel userLabel = new JLabel("Usuário");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBackground(Color.BLUE);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBackground(Color.BLUE);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("\n OK ");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        loginButton.setBackground(Color.BLUE);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());
            JOptionPane.showMessageDialog(panel, " Olá " + username + " a sua senha é: " + password + "123");
        });
    }
}