import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSystem extends JFrame {
    private JPanel panelMain;
    private JButton radioFormButton;
    private JButton checkBoxButton;
    private JButton wylogujButton;
    private JButton wyjscieButton;
    private int width = 400, height = 300;

    public MainSystem() {
        super("Zalogowano do systemu");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        radioFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RadioForm radioForm = new RadioForm();
                radioForm.setVisible(true);
            }
        });

        checkBoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CheckBoxForm checkBoxForm = new CheckBoxForm();
                checkBoxForm.setVisible(true);
            }
        });

        wylogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
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
