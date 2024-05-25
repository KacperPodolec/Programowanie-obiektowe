import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton iloczynButton;
    private JButton ilorazButton;
    private JLabel lblScore;
    private JButton wyczyscButton;
    private JButton zamknijButton;
    /*private JButton buttonOk;
    private JButton buttonClose;
    private JLabel changeLabel;
    private JButton buttonChange;*/

    private double inputA, inputB, score;

    public static void main(String[] args) {
        Example example = new Example();
        example.setVisible(true); //pojawienie się okna
    }

    public Example() {
        //super("Moje pierwsze okno");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 650, height = 650;
        this.setSize(width, height);
        //this.pack();

        /*buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Podaj imię: ");

                JOptionPane.showMessageDialog(null, "witaj: " + name);
            }
        });
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeLabel.setText(new Date().toString());
            }
        });*/

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputA = Double.parseDouble(textField1.getText());
                inputB = Double.parseDouble(textField2.getText());
                score = inputA + inputB;
                lblScore.setText("Suma: " + String.valueOf(inputA) + " + " + String.valueOf(inputB) + " = " + String.valueOf(score));
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputA = Double.parseDouble(textField1.getText());
                inputB = Double.parseDouble(textField2.getText());
                score = inputA - inputB;
                lblScore.setText("Różnica: " + String.valueOf(inputA) + " - " + String.valueOf(inputB) + " = " + String.valueOf(score));
            }
        });
        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputA = Double.parseDouble(textField1.getText());
                inputB = Double.parseDouble(textField2.getText());
                score = inputA * inputB;
                lblScore.setText("Iloczyn: " + String.valueOf(inputA) + " * " + String.valueOf(inputB) + " = " + String.valueOf(score));
            }
        });
        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputA = Double.parseDouble(textField1.getText());
                inputB = Double.parseDouble(textField2.getText());
                score = inputA / inputB;
                if (inputB != 0) {
                    lblScore.setText("Iloraz: " + String.valueOf(inputA) + " / " + String.valueOf(inputB) + " = " + String.valueOf(score));
                } else {
                    lblScore.setText("Nie wolno dzielić przez zero!");
                }
            }
        });
        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                textField2.setText(null);
                lblScore.setText("Wynik działania...");
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
