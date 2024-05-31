import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ContainerAdapter;

public class RadioForm extends JFrame {

    private JPanel panelRadio;
    private JRadioButton linuxradioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JButton OKButton;
    private JLabel iconLabel;
    private JButton wsteczButton;
    private JButton wyjscieButton;
    private int width = 400, height = 300;
    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("Windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Apple.png"));
    String os;

    //metoda do resize rysunku
    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public RadioForm() {
        super("Radio Panel");
        this.setContentPane(this.panelRadio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        linuxradioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (linuxradioButton.isSelected()) {
                    iconLabel.setIcon(resize(iconLinux, 50, 50));
                    os = "Linux";
                }
            }
        });

        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (windowsRadioButton.isSelected()) {
                    iconLabel.setIcon(resize(iconWindows, 50, 50));
                    os = "Windows";
                }
            }
        });

        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (macintoshRadioButton.isSelected()) {
                    iconLabel.setIcon(resize(iconMac, 50, 50));
                    os = "Macintosh";
                }
            }
        });

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Wybrałeś: " + os, "Wiadomość", JOptionPane.INFORMATION_MESSAGE);
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
