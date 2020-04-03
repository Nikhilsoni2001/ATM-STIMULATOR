package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1,b2,b3;
    
    public Login()
    {
        l1=new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Ostward",Font.BOLD,30));
        
        l2=new JLabel("CARD NO.");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        
        l1=new JLabel("PIN");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        
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
        
        setLayout(null);        
        
        l1.setBounds(175, 50,450, 200);
        add(l1);
        
        l1.setBounds(125, 150,375, 200);
        add(l2);
        
        l1.setBounds(125, 225, 375, 200);
        add(l3);
        
        tf1.setFont(new Font("ARIAL",Font.BOLD,14));
        add(tf1);
        
        pf1.setFont(new Font("ARIAL",Font.BOLD,14));
        pf1.setBounds(300, 310, 230, 30);
        add(pf1);
        
        b1.setFont(new Font("ARIAL",Font.BOLD,14));
        b1.setBounds(300, 400, 100, 30);
        add(b1);
        
        b2.setFont(new Font("ARIAL",Font.BOLD,14));
        b2.setBounds(430, 400, 100, 30);
        add(b2);
        
        b3.setFont(new Font("ARIAL",Font.BOLD,14));
        b3.setBounds(300, 450, 230, 30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.white);
        
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);
        
    }
    
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
                }
    }
}
   
