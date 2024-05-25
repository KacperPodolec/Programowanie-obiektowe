import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {
    private JPanel panel1;
    private JTextField temperaturaC;
    private JLabel temperaturaF;
    private JButton konwertujButton;
    private JButton zamknijButton;
    private JButton wyczyscButton;
    private JLabel termometrIcon;

    public static void main(String[] args) {
        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.setVisible(true);
    }

    private double temperaturaIn;
    private double temperaturaOut;

    public Zadanie1() {
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 650, height = 650;
        this.setSize(width, height);


        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temperaturaIn = Double.parseDouble(temperaturaC.getText());
                temperaturaOut = ((temperaturaIn * 1.8) + 32);
                temperaturaF.setText(String.valueOf(temperaturaOut));
            }
        });

        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temperaturaC.setText(null);
                temperaturaF.setText("...");
            }
        });

        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
