package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules (String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer, answer point to point" + "<br><br>" +
                        "2. The contest will be having only one round. " + "<br><br>" +
                        "3. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "4. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "5. Total Number of questions are 10 " + "<br><br>" +
                        "6. They will be given 15 seconds for each question. " + "<br><br>" +
                        "7. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "8.Problem statements are available only in one language: English" + "<br><br>" +
                        "9.Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);


        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);

        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User"); //making new rules class obj
    }
}
