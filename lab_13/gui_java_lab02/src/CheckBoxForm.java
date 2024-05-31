import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxForm extends JFrame {

    private JPanel panelCheckBox;
    private JCheckBox javaPrice3500CheckBox;
    private JCheckBox cPrice4500CheckBox;
    private JCheckBox cPrice4000CheckBox;
    private JCheckBox pythonPrice5000PLNCheckBox;
    private JButton OKButton;
    private JButton wsteczButton;
    private JButton wyjscieButton;
    private int width = 400, height = 300;

    public CheckBoxForm() {
        super("Radio Panel");
        this.setContentPane(this.panelCheckBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder wybrane = new StringBuilder();
                int razem = 0;

                if (javaPrice3500CheckBox.isSelected()) {
                    wybrane.append("Java #price 3500 PLN\n");
                    razem += 3500;
                }
                if (cPrice4000CheckBox.isSelected()) {
                    wybrane.append("C++ #price 4000 PLN\n");
                    razem += 4000;
                }
                if (cPrice4500CheckBox.isSelected()) {
                    wybrane.append("C# #price 4500 PLN\n");
                    razem += 4500;
                }
                if (pythonPrice5000PLNCheckBox.isSelected()) {
                    wybrane.append("Python #price 5000 PLN\n");
                    razem += 5000;
                }
                JOptionPane.showMessageDialog(null, wybrane.toString() + "\nRazem: " + razem, "Razem", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainSystem mainSystem = new MainSystem();
                mainSystem.setVisible(true);
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
