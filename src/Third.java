import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Third extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Try again");
    JCheckBox showPassword = new JCheckBox("Show Password");


    Third() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(70, 100, 100, 20);
        passwordLabel.setBounds(70, 120, 100, 20);
        userTextField.setBounds(170, 100, 150, 20);
        passwordField.setBounds(170, 120, 150, 20);
        showPassword.setBounds(170, 140, 150, 20);
        loginButton.setBounds(70, 160, 100, 20);
        resetButton.setBounds(220, 160, 100, 20);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Ann") && pwdText.equalsIgnoreCase("123")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
    public static void main(String[] a) {
        Third frame = new Third();
        frame.setTitle("Password application");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}