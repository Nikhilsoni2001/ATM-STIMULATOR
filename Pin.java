package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2;
    public void pin()
    {
        setFont(new Font("System", Font.BOLD ,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("PIN");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (5*x);
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"PIN");
        
        l1= new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,35));
                
        l2=new JLabel("Current Pin:");
        l2.setFont(new Font("System",Font.BOLD,35));
        
        l3=new JLabel("New Pin:");
        l3.setFont(new Font("System",Font.BOLD,14));
        
        l4=new JLabel("Re-Enter New Pin:");
        l4.setFont(new Font("System",Font.BOLD,14));
        
        t1=new JTextField();
        t1.setFont(new Font("System",Font.BOLD,22));
        
        t2=new JTextField();
        t2.setFont(new Font("System",Font.BOLD,14));
        
        t3=new JTextField();
        t3.setFont(new Font("System",Font.BOLD,14));
        
        b1=new JButton("SAVE");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
      setLayout(null);
      
        l1.setBounds(220, 130, 800, 60);
        add(l1);
        
        l2.setBounds(100, 240, 150, 40);
        add(l2);
        
        l3.setBounds(100, 300, 150, 40);
        add(l3);
        
        l4.setBounds(100, 360, 200, 40);
        add(l4);
        
        t1.setBounds(310, 240, 360, 40);
        add(t1);
        
        t2.setBounds(310, 300, 360, 40);
        add(t2);
        
        t3.setBounds(310, 360, 360, 40);
        add(t3);
        
        b1.setBounds(220, 460, 160, 50);
        add(b1);
        
        b2.setBounds(400, 460, 160, 50);
        add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String a=t1.getText();
            String b=t2.getText();
            String c=t3.getText();
            
            if(ae.getSource()==b2)
            {
                if(t1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Current Pin");
                }
                else if(t2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter New Pin");
                }
                else if(t3.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
                }
                if(t2.getText().equals(t2.getText()))
                {
                    conn n = new conn();
                    String q1 = "update bank set pin = '"+b+"'where pin = '"+a+"' ";
                    String q2 = "update login set pin = '"+b+"'where pin = '"+a+"' ";
                    String q3 = "update SignUp3 set pin = '"+b+"'where pin = '"+a+"' ";
                    
                    n.s.executeUpdate(q1);
                    n.s.executeUpdate(q2);
                    n.s.executeUpdate(q3);
                    
                    JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
                    new Transactions().setVisible(true);
                    setVisible(false);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Entered Pin Doesn't Match");
                }
            }
            else if(ae.getSource()==b2)
            {
                new Transactions().setVisible(TRUE);
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }
    public static void main(String args)
    {
        new Pin().setVisible(true);
    }
}
