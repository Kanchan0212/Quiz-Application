package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{  //to see frame use Jframe class(inheritance) which is in swing package
    JButton rules, back; // declare gllobaly
    JTextField tfname;
    Login(){  //make constructor
        getContentPane().setBackground(Color.WHITE); //Color.white class is in awt package
        setLayout(null);  //using own layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(730,60,300,45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(710,150,200,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        name.setForeground(Color.BLACK);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(680,200,280,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(680,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(840,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1000,500);
        setLocation(250,150);
        setVisible(true); //fun1- frane by default is hidden so say true
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if (ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
       new Login(); //ananomus obj of class no need to store in variable
    }
}
