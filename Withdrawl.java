package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Withdrawl{
    
    JFrame jf = new JFrame("WithDrawl");
    Container c = jf.getContentPane();
    JPanel p = new JPanel();
    
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JButton b1,b2,b3;
    
    public void Withdrawl()
    {
  /*   setFont(new Font("System", Font.BOLD ,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("WITHDRAWL");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (5*x);
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"WITHDRAWL");
    */    
        l4= new JLabel("MAXIMUM DAILY WITHDRAWL");
        l4.setFont(new Font("System",Font.BOLD,40));
                
        l5=new JLabel("IS Rs.10,000");
        l5.setFont(new Font("System",Font.BOLD,40));
        
        l1= new JLabel("ENTER AMOUNT YOU WANT ");
        l1.setFont(new Font("System",Font.BOLD,35));
                
        l2=new JLabel("TO WITHDRAWL");
        l2.setFont(new Font("System",Font.BOLD,35));
        
        l3=new JLabel("Enter Pin:");
        l3.setFont(new Font("System",Font.BOLD,14));
        
        t1=new JTextField();
        t1.setFont(new Font("System",Font.BOLD,22));
        
        t2=new JTextField();
        t2.setFont(new Font("System",Font.BOLD,14));
        
        b1=new JButton("WITHDRAW");
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
        
        p.setLayout(null);
        
        l3.setBounds(620, 10, 80, 20);
        p.add(l3);
        
        t2.setBounds(700, 10, 40, 30);
        p.add(t2);
        
        l4.setBounds(90, 100, 800, 60);
        p.add(l4);
        
        l5.setBounds(270, 160, 800, 60);
        p.add(l5);
        
        l1.setBounds(150, 150, 80, 60);
        p.add(l1);
        
        l2.setBounds(290, 210, 800, 60);
        p.add(l2);
        
        t1.setBounds(250, 300, 300, 50);
        p.add(t1);
        
        b1.setBounds(260, 380, 125, 50);
        p.add(b1);
        
        b2.setBounds(415, 380, 125, 50);
        p.add(b2);
        
        b3.setBounds(300, 550, 200, 50);
        p.add(b3);
        
       
        
       //b1.addActionListener(this);
       //b2.addActionListener(this);
       //b3.addActionListener(this);
        
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(850, 850);
        jf.setLocation(500, 90);
        jf.setVisible(true);
        
        c.add(p);  
        
    }
    
    
    public static void main(String args[])
    {
        Withdrawl z = new Withdrawl();
        z.Withdrawl();
    }
    
}

    
  /*  
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
                    JOptionPane.showMessageDialog(null, "Please Enter Amount You Want To Withdraw");
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
    */