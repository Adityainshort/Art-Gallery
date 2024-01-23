import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GalleryStart {
    String name="Aman", title="Cheery Groove Forest", date="22/01/2024", dimension="500 X 350",
    event = "Artist: Aryan / Title: Magic Kingdom / Date: soon.. Feb, 2024",
    event2 ="Title: Jungle Mosh / Date: soon.. March, 2024";
    JFrame frame;
    JLabel label, label2, label3;
    ImageIcon icon, icon2;
    ImageIcon p0Icon, p0icon, p1Icon, p1icon,  p2Icon, p2icon;
    JButton bs2 = new JButton();
    JButton bs1 = new JButton();
    JButton bs3 = new JButton();




        JLabel l1= new JLabel("Artist: "+name);
        JLabel l2=new JLabel("Title: "+title);
        JLabel l3=new JLabel("Date created: "+date);
        JLabel l4=new JLabel("Dimension: "+dimension);


    String[] location = {
            "src\\allImages\\img1.jpg",
            "src\\allImages\\img2.jpg",
            "src\\allImages\\img3.jpg",
            "src\\allImages\\Amazon.jpg"};

    JPanel panel1, panel2, panel3, panel4, panel5,  mainPanel;
    JButton button = new JButton("Skip");
    JButton login = new JButton("Login");
        GalleryStart() {

            login.setBounds(320, 450, 70, 25);
            login.setBackground(Color.DARK_GRAY);
            login.addActionListener(e -> new LoginPage());
            login.setForeground(Color.WHITE);
            login.setFocusable(false);

            label2 = new JLabel("Welcome to Art Gallery!!");
            label2.setBounds(220, 10, 400, 30);
            label2.setFont(new Font("Dialog", Font.PLAIN, 24));
            label2.setForeground(Color.WHITE);

            label3 = new JLabel("Please login for smooth experience :)");
            label3.setBounds(10, 470, 400, 30);
            label3.setFont(new Font("Dialog", Font.PLAIN, 10));
            label3.setOpaque(true);
            label3.setBackground(Color.BLACK);
            label3.setForeground(Color.WHITE);

            icon = new ImageIcon(location[2]);
            p0icon = new ImageIcon(location[3]);
            p1icon = new ImageIcon(location[1]);
            p2icon = new ImageIcon(location[2]);


            Image image = icon.getImage().getScaledInstance(750, 540, Image.SCALE_SMOOTH);
            icon2 = new ImageIcon(image);

            Image image1 = p0icon.getImage().getScaledInstance(460, 320, Image.SCALE_SMOOTH);
            p0Icon = new ImageIcon(image1);

            Image image2 = p1icon.getImage().getScaledInstance(460, 320, Image.SCALE_SMOOTH);
            p1Icon = new ImageIcon(image2);

            Image image3 = p2icon.getImage().getScaledInstance(460, 320, Image.SCALE_SMOOTH);
            p2Icon = new ImageIcon(image3);

            label = new JLabel();
            label.setIcon(icon2);
            label.setBounds(40, 30, 700, 500);
            label.add(label2);
            label.add(login);
            label.add(label3);

            bs1.addActionListener(e -> bs2.setVisible(true));
            bs1.addActionListener(e -> bs1.setVisible(false));
            bs1.setVisible(true);
            bs1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == bs1) {
                        l1.setText("Artist: Aryan");
                        l2.setText("Title: Retro City");
                        l3.setText("Date created: 12/04/2022");
                        l4.setText("Dimension: 900X600");
                    }
                }
            });
            bs1.setIcon(p0Icon);

            bs2.setVisible(false);
            bs2.addActionListener(e -> bs3.setVisible(true));
            bs2.addActionListener(e -> bs2.setVisible(false));
            bs2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == bs2) {
                        l1.setText("Artist: Ravi");
                        l2.setText("Title: Day Dream");
                        l3.setText("Date created: 19/02/2023");
                        l4.setText("Dimension: 1100X900");
                    }
                }
            });
            bs2.setIcon(p1Icon);

            bs3.setVisible(false);
            bs3.addActionListener(e -> bs1.setVisible(true));
            bs3.addActionListener(e -> bs3.setVisible(false));
            bs3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    l1.setText("Artist: " + name);
                    l2.setText("Title: " + title);
                    l3.setText("Date created: " + date);
                    l4.setText("Dimension: " + dimension);
                }
            });
            bs3.setIcon(p2Icon);


            panel1 = new JPanel();
            panel1.setOpaque(true);
            panel1.setSize(500, 350);
            panel1.setLocation(0, 0);
            panel1.setBackground(new Color(0x1E0601));
            panel1.add(bs1);
            panel1.add(bs2);
            panel1.add(bs3);


            l1.setForeground(Color.WHITE);
            l1.setBounds(15, 5, 400, 30);

            l2.setForeground(Color.WHITE);
            l2.setBounds(15, 25, 400, 30);

            l3.setForeground(Color.WHITE);
            l3.setBounds(15, 45, 400, 30);

            l4.setForeground(Color.WHITE);
            l4.setBounds(15, 65, 400, 30);

            panel2 = new JPanel();
            panel2.setSize(500, 100);
            panel2.setLayout(null);
            panel2.setLocation(0, 350);
            panel2.setBackground(Color.black);
            panel2.add(l1);
            panel2.add(l2);
            panel2.add(l3);
            panel2.add(l4);


            JLabel lb1 = new JLabel("Upcoming Events!!");
            lb1.setForeground(new Color(0xDB90F3));
            lb1.setFont(new Font("serif", Font.BOLD, 20));
            lb1.setSize(200, 40);
            lb1.setLocation(170, 5);

            JLabel lb2 = new JLabel("Event: " + event);
            lb2.setSize(480, 30);
            lb2.setForeground(Color.WHITE);
            lb2.setLocation(20, 45);
            lb2.setFont(new Font("Courier", Font.PLAIN, 14));

            JLabel lb3 = new JLabel("Event: " + event2);
            lb3.setSize(480, 30);
            lb3.setForeground(Color.WHITE);
            lb3.setLocation(20, 65);
            lb3.setFont(new Font("Courier", Font.PLAIN, 14));

            JLabel lb4 = new JLabel("Coming soon......!!!");
            lb4.setSize(480, 30);
            lb4.setForeground(Color.WHITE);
            lb4.setLocation(20, 85);
            lb4.setFont(new Font("Courier", Font.PLAIN, 14));


            panel3 = new JPanel();
            panel3.setSize(500, 150);
            panel3.setLocation(0, 450);
            panel3.setBackground(new Color(0xFF763979, true));
            panel3.setLayout(null);
            panel3.add(lb1);
            panel3.add(lb2);
            panel3.add(lb3);
            panel3.add(lb4);

            JButton b1 = new JButton("Login");
            b1.setFocusable(false);
            b1.addActionListener(e -> new LoginPage());
            b1.setBackground(new Color(0x030969));
            b1.setForeground(Color.WHITE);
            b1.setBounds(50, 175, 200, 30);


            JButton b2 = new JButton("Gallery");
            b2.setFocusable(false);
            b2.setBackground(new Color(0x030969));
            b2.setForeground(Color.WHITE);
            b2.setBounds(50, 225, 200, 30);


            JButton b3 = new JButton("Artist's Corner");
            b3.setFocusable(false);
            b3.setBackground(new Color(0x030969));
            b3.setForeground(Color.WHITE);
            b3.setBounds(50, 275, 200, 30);


            JButton b4 = new JButton("For Sale");
            b4.setFocusable(false);
            b4.setBackground(new Color(0x030969));
            b4.setForeground(Color.WHITE);
            b4.setBounds(50, 325, 200, 30);

            JButton b5 = new JButton("?");
            b5.setFocusable(false);
            b5.setBackground(new Color(0x030969));
            b5.setForeground(Color.WHITE);
            b5.setBounds(220, 520, 50, 30);

            JButton b6 = new JButton("Cart");
            b6.setFocusable(false);
            b6.setBackground(new Color(0x030969));
            b6.setForeground(Color.WHITE);
            b6.setBounds(8, 8, 60, 30);

            JButton b7 = new JButton("Exit");
            b7.setFocusable(false);
            b7.setBackground(new Color(0x030969));
            b7.addActionListener(e -> frame.dispose());
            b7.setForeground(Color.WHITE);
            b7.setBounds(50, 375, 200, 30);


            panel4 = new JPanel();
            panel4.setSize(300, 600);
            panel4.setLocation(500, 0);
            panel4.setLayout(null);
            panel4.setVisible(true);
            panel4.setBackground(new Color(0xE804929F, true));
            panel4.add(b1);
            panel4.add(b2);
            panel4.add(b3);
            panel4.add(b4);
            panel4.add(b5);
            panel4.add(b6);
            panel4.add(b7);

            button.setBounds(700, 5, 70, 20);
            button.setBackground(Color.DARK_GRAY);
            button.setForeground(Color.WHITE);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button) {
                        panel5.setVisible(false);
                        mainPanel.setVisible(true);
                    }
                }
            });
            button.setFocusable(false);

            panel5 = new JPanel();
            panel5.setBounds(0, 0, 800, 600);
            panel5.setBackground(Color.white);
            panel5.setLayout(null);
            panel5.add(label);
            panel5.add(button);

            mainPanel = new JPanel();
            mainPanel.setSize(800, 600);
            mainPanel.setVisible(false);
            mainPanel.setLayout(null);
            mainPanel.add(panel1);
            mainPanel.add(panel2);
            mainPanel.add(panel3);
            mainPanel.add(panel4);

            frame = new JFrame();
            frame.setSize(800, 600);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.GRAY);
            frame.setLocationRelativeTo(null);
            frame.add(panel5);
            frame.add(mainPanel);

        }

    }

