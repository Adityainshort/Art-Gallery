import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    JFrame frame1;
    JButton newUser, existingUser, backButton;

    LoginPage(){
        newUser = new JButton("New User");
        newUser.setFocusable(false);
        newUser.setBounds(180,100,220,30);
        newUser.addActionListener(e -> new NewUser());
        newUser.setBackground(Color.DARK_GRAY);
        newUser.setForeground(Color.WHITE);



        existingUser = new JButton("Existing User");
        existingUser.setFocusable(false);
        existingUser.setBounds(180,200,220,30);
        existingUser.setBackground(Color.DARK_GRAY);
        existingUser.setForeground(Color.WHITE);


        backButton = new JButton("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
            }
        });
        backButton.setBounds(10,8,70,30);
        backButton.setBackground(Color.DARK_GRAY);
        backButton.setForeground(Color.WHITE);


        frame1 = new JFrame("Login");
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.getContentPane().setBackground(Color.WHITE);
        frame1.setSize(600, 400);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.add(newUser);
        frame1.add(existingUser);
        frame1.add(backButton);

    }
}
class NewUser{


    JFrame frame;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField f1,f2, f3, f4, f5, f6;
    JButton J1, J2, J3;
    NewUser(){
        l1 = new JLabel("NAME");
        l2 = new JLabel("Phone Number:");
        l3 = new JLabel("Email ID:");
        l4 = new JLabel("Create password: ");
        l5 = new JLabel("Confirm Password: ");
        l6 = new JLabel("Create User_ID: ");
        l1.setBounds(70, 60, 50, 30);
        l2.setBounds(70,100, 120, 30);
        l3.setBounds(70, 140, 100, 30);
        l4.setBounds(70, 180, 150, 30);
        l5.setBounds(70, 220, 150, 30);
        l6.setBounds(70, 260, 150, 30);

        f1 = new JTextField();
        f1.setBounds(250,60,250,30);

        f2 = new JTextField();
        f2.setBounds(250,100,250,30);

        f3 = new JTextField();
        f3.setBounds(250,140,250,30);

        f4 = new JTextField();
        f4.setBounds(250,180,250,30);

        f5 = new JTextField();
        f5.setBounds(250,220,250,30);

        f6 = new JTextField();
        f6.setBounds(250,260,250,30);

        J1 = new JButton("Register");
        J1.setBounds(400, 320, 100, 30);
        J2 = new JButton("Back");
        J2.setBounds(70, 320, 70, 30);
        J3 = new JButton("HOME");
        J3.setBounds(20, 10, 80, 30);

        frame = new JFrame("Login");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0xFFF1F112, true));
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);

        frame.add(f1);
        frame.add(f2);
        frame.add(f3);
        frame.add(f4);
        frame.add(f5);
        frame.add(f6);

        frame.add(J1);
        frame.add(J2);
        frame.add(J3);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }
}
