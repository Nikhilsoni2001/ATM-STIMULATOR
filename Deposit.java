package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Deposit extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3; 
   
    public void deposit()
    {
        setFont(new Font("System", Font.BOLD ,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("DEPOSIT");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (5*x);
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"DEPOSIT");
        
        l1= new JLabel("ENTER AMOUNT YOU WANT ");
        l1.setFont(new Font("System",Font.BOLD,35));
                
        l2=new JLabel("TO DEPOSIT");
        l2.setFont(new Font("System",Font.BOLD,35));
        
        l3=new JLabel("Enter Pin:");
        l3.setFont(new Font("System",Font.BOLD,14));
        
        t1=new JTextField();
        t1.setFont(new Font("System",Font.BOLD,22));
        
        t2=new JTextField();
        t2.setFont(new Font("System",Font.BOLD,14));
        
        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3=new JButton("EXIT");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l3.setBounds(620, 10, 80, 20);
        add(l3);
        
        t2.setBounds(700, 10, 40, 30);
        add(t2);
        
        l1.setBounds(150, 150, 80, 60);
        add(t1);
        
        l2.setBounds(290, 210, 800, 60);
        add(l2);
        
        t1.setBounds(250, 300, 300, 50);
        add(t1);
        
        b1.setBounds(260, 380, 125, 50);
        add(b1);
        
        b2.setBounds(415, 380, 125, 50);
        add(b2);
        
        b3.setBounds(300, 550, 200, 50);
        add(b3);
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setSize(800, 800);
        setLocation(500, 90);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
        String a= t1.getText();
        String b= t2.getText();
        
            if(ae.getSource()==b1)
            {
                if(t1.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Amount You Want To Deposit");
                }
                else
                {
                   conn n = new conn();

                   ResultSet rs = n.s.executeQuery("select * from bank where pin = '"+b+"' ");

                   double balance =0;
                   if(rs.next())
                   {
                       String pin=rs.getDouble("pin");
                       balance = rs.getDouble("balance");
                       
                       Double d = Double.parseDouble(a);
                       balance+=d;
                       String q1 = "insert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
                       
                       n.s.executeUpdate(q1);

                   }
                   JOptionPane.showMessageDialog(null, "Rs "+a+" Deposited Successfully");
                   new Transactions().setVisible(true);
                   setVisible(false);
                 }
            }
            else if(ae.getSource()==b2)
            {
                new Transactions().setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource()==b3)
            {
                System.exit(0);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }
    
    public static void main(String args[])
    {
        new Deposit().setVisible(true);
    }
    
}
