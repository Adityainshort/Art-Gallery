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
        newUser.addActionListener(e -> new NewUser()) ;
        newUser.setBackground(Color.DARK_GRAY);
        newUser.setForeground(Color.WHITE);

        existingUser = new JButton("Existing User");
        existingUser.setFocusable(false);
        existingUser.addActionListener(e -> new ExistingUser());
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
    JTextField f1,f2;
    JLabel l1,l2;
    JButton submitButton, backButton;

    NewUser(){

        f1 = new JTextField();
        f1.setBounds(180,100,220,30);
        l1=new JLabel("Enter Name");
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(180,75,220,30);


        f2 = new JTextField();
        f2.setBounds(180,200,220,30);
        l2 = new JLabel("Enter Password");
        l2.setBounds(180,175,220,30);
        l2.setForeground(Color.DARK_GRAY);

        submitButton= new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setBounds(180,250,220,30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Connect JDBC code here
                frame.dispose();
            }
        });
        submitButton.setBackground(Color.DARK_GRAY);
        submitButton.setForeground(Color.WHITE);


        backButton = new JButton("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LoginPage();
            }
        });
        backButton.setBounds(10,8,70,30);
        backButton.setBackground(Color.DARK_GRAY);
        backButton.setForeground(Color.WHITE);


        frame = new JFrame("Login");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(f1);
        frame.add(l1);
        frame.add(f2);
        frame.add(l2);
        frame.add(submitButton);
        frame.add(backButton);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }
}
   class ExistingUser{
        JFrame frame2;

        JTextField f1,f2;

        JLabel l1,l2;

        JButton submitButton, backButton;

        ExistingUser(){

            f1 = new JTextField();
            f1.setBounds(180,100,220,30);
            l1=new JLabel("Enter Name");
            l1.setForeground(Color.DARK_GRAY);
            l1.setBounds(180,75,220,30);


            f2 = new JTextField();
            f2.setBounds(180,200,220,30);
            l2 = new JLabel("Enter Password");
            l2.setBounds(180,175,220,30);
            l2.setForeground(Color.DARK_GRAY);

            submitButton= new JButton("Submit");
            submitButton.setFocusable(false);
            submitButton.setBounds(180,250,220,30);
//            submitButton.addActionListener(e -> new NewUser());

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(f1.getText().isEmpty()||f2.getText().isEmpty()){
                        frame2.dispose();

                    }

                    frame2.dispose();
                }
            });
            submitButton.setBackground(Color.DARK_GRAY);
            submitButton.setForeground(Color.WHITE);


            backButton = new JButton("Back");
            backButton.setFocusable(false);
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    frame2.dispose();
                    new LoginPage();
                }
            });
            backButton.setBounds(10,8,70,30);
            backButton.setBackground(Color.DARK_GRAY);
            backButton.setForeground(Color.WHITE);


            frame2 = new JFrame("Login");
            frame2.setLayout(null);
            frame2.setVisible(true);
            frame2.getContentPane().setBackground(Color.WHITE);
            frame2.setSize(600, 400);
            frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame2.add(f1);
            frame2.add(l1);
            frame2.add(f2);
            frame2.add(l2);
            frame2.add(submitButton);
            frame2.add(backButton);
            frame2.setLocationRelativeTo(null);
            frame2.setResizable(false);

}}


class iderror{

}