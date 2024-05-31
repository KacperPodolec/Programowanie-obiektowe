import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelLogin;
    private JButton zalogujButton;
    private JButton wyjscieButton;
    private JTextField userName;
    private JPasswordField userPassword;
    private JPasswordField confirmPassword;
    private int width = 400, height = 300;
    String user = "admin", password = "admin";

    public LoginForm() {
        super("Logowanie do systemu");
        this.setContentPane(this.panelLogin);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        zalogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameInput = userName.getText();
                String userPasswordInput = new String(userPassword.getPassword());
                String confirmPasswordInput = new String(confirmPassword.getPassword());

                if (userNameInput.equals(user) && userPasswordInput.equals(password) && confirmPasswordInput.equals(password)) {
                    dispose();
                    MainSystem mainSystem = new MainSystem();
                    mainSystem.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Logowanie powiodło się", "Status logowania", JOptionPane.INFORMATION_MESSAGE);
                } else if (userNameInput.equals(user) && !(userPasswordInput.equals(confirmPasswordInput))) {
                    JOptionPane.showMessageDialog(null, "Podane hasła są różne", "Status logowania", JOptionPane.ERROR_MESSAGE);
                    userPassword.setText("");
                    confirmPassword.setText("");
                } else if (userNameInput.equals(user) && userPasswordInput.equals(confirmPasswordInput) && !(userPasswordInput.equals(password))) {
                    JOptionPane.showMessageDialog(null, "Błędne hasło", "Status logowania", JOptionPane.ERROR_MESSAGE);
                    userPassword.setText("");
                    confirmPassword.setText("");
                }
            }
        });

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
