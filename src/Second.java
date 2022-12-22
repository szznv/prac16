import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Second extends JFrame {
    JLabel eastText = new JLabel("ВАО");
    JLabel westText = new JLabel("ЗАО");
    JLabel northText = new JLabel("САО",SwingConstants.CENTER);
    JLabel southText = new JLabel("ЮАО",SwingConstants.CENTER);
    JLabel centerText = new JLabel("ЦАО",SwingConstants.CENTER);
    public Second(){
        super("Курсор");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);
        Container window = getContentPane();
        window.setLayout(new BorderLayout());
        window.add(northText, BorderLayout.NORTH);
        window.add(southText, BorderLayout.SOUTH);
        window.add(westText, BorderLayout.WEST);
        window.add(eastText, BorderLayout.EAST);
        window.add(centerText, BorderLayout.CENTER);
        eastText.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ВАО");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЗАО");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в САО");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать ЮАО");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЦАО");
            }
        });
    }
    public static void main(String[] args) {
        new Second().setVisible(true);
    }
}