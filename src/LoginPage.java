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
        frame1.getContentPane().setBackground(new Color(0xDA6400BD, true));
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

    JFrame frame = new JFrame("New User");


    NewUser(){
    frame.setResizable(false);
    frame.setSize(600,400);


    }
}
