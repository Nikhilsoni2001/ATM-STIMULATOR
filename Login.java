package atm.simulator;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;

public class Login /*extends JFrame implements ActionListener */{
        

        JFrame jf = new JFrame("Login");
        Container c = jf.getContentPane();
        JPanel p = new JPanel();
        
        JLabel l1,l2,l3;
        JTextField tf1;
        JPasswordField pf1;
        JButton b1,b2,b3;
    
        public void Login()
        {
        l1=new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Ostward",Font.BOLD,30));
        
        l2=new JLabel("CARD NO.");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        
        l3=new JLabel("PIN");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        
        tf1=new JTextField(16);
        pf1=new JPasswordField(4);
        
        b1=new JButton("SIGN IN");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        
        b2=new JButton("CLEAR");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
          
        b3=new JButton("SIGN UP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        
        p.setLayout(null);        
        
        l1.setBounds(175, 50,450, 200);
        p.add(l1);
        
        l2.setBounds(125, 150,375, 200);
        p.add(l2);
        
        l3.setBounds(125, 225, 375, 200);
        p.add(l3);
        
        tf1.setFont(new Font("ARIAL",Font.BOLD,14));
        tf1.setBounds(300, 240, 230, 30);
        p.add(tf1);
        
        pf1.setFont(new Font("ARIAL",Font.BOLD,14));
        pf1.setBounds(300, 310, 230, 30);
        p.add(pf1);
        
        b1.setFont(new Font("ARIAL",Font.BOLD,14));
        b1.setBounds(300, 400, 100, 30);
        p.add(b1);
        
        b2.setFont(new Font("ARIAL",Font.BOLD,14));
        b2.setBounds(430, 400, 100, 30);
        p.add(b2);
        
        b3.setFont(new Font("ARIAL",Font.BOLD,14));
        b3.setBounds(300, 450, 230, 30);
        p.add(b3);
        
        //b1.addActionListener(this);
        //b2.addActionListener(this);
        //b3.addActionListener(this);
        
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 800);
        jf.setLocation(500, 90);
        jf.setVisible(true);
        
        c.add(p);
        }  
        public static void main(String args[]){
            Login z = new Login();
            z.Login();
    }}
    /*
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            conn c1=new conn();
            String a = tf1.getText();
            String b = pf1.getText();
            String q = "select * from Login where CARD NO. = '"+a+"'and PIN = '"+b+"'";
            ResultSet rs = c1.s.executeQuery(q);
            
            if(ae.getSource()==b1)
            {
                if(rs.next())
                {
                    new Transactions().setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect CARD NO. or PIN");
                }
            }
            
            else if(ae.getSource()==b2)
            {
                tf1.setText("");
                pf1.setText("");
            }
            
            else if(ae.getSource()==b3)
            {
                new SignUp().setVisible(true);
                setVisible(false);
            }
            
        }      
        catch(Exception e)
                {
                    e.printStackTrace();
                    System.out.println("error: "+e);
                }*/
    
