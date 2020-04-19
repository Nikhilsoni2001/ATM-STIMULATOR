package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Transactions
{
   
    JFrame jf = new JFrame("SignUp3");
    Container c = jf.getContentPane();
    JPanel p = new JPanel();
    
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    public void Transactions()
    {
     /*   setFont(new Font("System", Font.BOLD ,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("TRANSACTION");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"TRANSACTION");
       */ 
        
        
        l1=new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.BOLD,12));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("Raleway",Font.BOLD,12));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3=new JButton("FAST CASH");
        b3.setFont(new Font("Raleway",Font.BOLD,12));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4=new JButton("MINI STATEMENT");
        b4.setFont(new Font("Raleway",Font.BOLD,12));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5=new JButton("PIN CHANGE");
        b5.setFont(new Font("Raleway",Font.BOLD,12));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6=new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("Raleway",Font.BOLD,12));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7=new JButton("EXIT");
        b7.setFont(new Font("Raleway",Font.BOLD,12));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        p.setLayout(null);
        
        l1.setBounds(100, 100, 700, 40);
        p.add(l1);
        
        b1.setBounds(40, 250, 300, 60);
        p.add(b1);
        
        b2.setBounds(440, 250, 300, 60);
        p.add(b2);
        
        b3.setBounds(40, 360, 300, 60);
        p.add(b3);
        
        b4.setBounds(440, 360, 300, 60);
        p.add(b4);
        
        b5.setBounds(440, 470, 300, 60);
        p.add(b5);
        
        b6.setBounds(440, 470, 300, 60);
        p.add(b6);
        
        b7.setBounds(240, 600, 300, 60);
        p.add(b7);
        
        
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        b3.addActionListener(this);
//        b4.addActionListener(this);
//        b5.addActionListener(this);
//        b6.addActionListener(this);
//        b7.addActionListener(this);
        
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 800);
        jf.setLocation(500, 90);
        jf.setVisible(true);
        
        c.add(p);
        
    }
     public static void main(String args[])
          {
              Transactions z = new Transactions();
              z.Transactions();
          }
}
 /*   
     public void actionPerformed(ActionEvent ae)
     {
         
         if(ae.getSource()==b1)
         {
             new Deposit().setVisible(true);
             setVisible(false);
         }
         else if(ae.getSource()==b2)
         {
             new Withdrawl().setVisible(true);
             setVisible(false);
         }
         else if(ae.getSource()==b3)
         {
             new FastCash().setVisible(true);
             setVisible(false);
         }
         else if(ae.getSource()==b4)
         {
             new Login().setVisible(true);
             setVisible(false);
         }
         else if(ae.getSource()==b5)
         {
             new Pin().setVisible(true);
             setVisible(false);
         }
         else if(ae.getSource()==b6)
         {
          String pin = JOptionPane.showInputDialog("Enter Pin:");
          conn n = new conn();
          
          try
          {
              
              ResultSet rs = n.s.executeQuery("Select balance from bank ORDER BY pin = '"+pin+"'DESC LIMIT 1");
              
              if(rs.next())
              {
                  String balance = rs.showMessageDialog(null,"Your Balance is "+balance);
                  
              }
          }
          catch(Exception e)
          {
              e.printStackTrace();
              System.out.println("error: "+e);
          }
         }
         else if(ae.getSource()==b7)
         {
             System.exit(0);
         }
    }
   */ 