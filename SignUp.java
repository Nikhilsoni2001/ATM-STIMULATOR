package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class SignUp {
    
     JFrame jf = new JFrame("SignUp");
    Container c = jf.getContentPane();
    JPanel p = new JPanel();
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1;
    JComboBox c1,c2,c3;
    
    
    /*Random rn = new Random();                                   //generates random number
    long first4 = (rn.nextLong() % 9000L)+1000L;
    long first = Math.abs(first4);
    */
    public void SignUp()
    {
        //to move text to center
        
      /*  setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM");
        */
        
        l1 = new JLabel("APPLICATION FORM NO. ");
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        
        l5 = new JLabel("Date Of Birth");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        
        l7 = new JLabel("Email Adress:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        
        l8 = new JLabel("Marital status:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        
        l9 = new JLabel("Adress:");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
          
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway",Font.BOLD,0));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway",Font.BOLD,14));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway",Font.BOLD,14));
        
        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setBackground(Color.BLACK);
        r1.setForeground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setBackground(Color.BLACK);
        r2.setForeground(Color.WHITE);
        
        r3 = new JRadioButton("Married");
        r3.setBackground(Color.BLACK);
        r3.setForeground(Color.WHITE);
        
        r4 = new JRadioButton("Unmarried");
        r4.setBackground(Color.BLACK);
        r4.setForeground(Color.WHITE);
        
        r5 = new JRadioButton("Other");
        r5.setBackground(Color.BLACK);
        r5.setForeground(Color.WHITE);
        
        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1= new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2= new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[]={"1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        c3= new JComboBox(year);
        c3.setBackground(Color.WHITE);
        
        p.setLayout(null);
        
        l1.setBounds(140, 20, 600, 40);
        p.add(l1);
        
        l2.setBounds(290, 70, 600, 30);
        p.add(l2);
        
        l3.setBounds(100, 140, 100, 30);
        p.add(l3);
        
        tf1.setBounds(100, 190, 200, 30);
        p.add(tf1);
        
        l4.setBounds(100, 240, 200, 30);
        p.add(l4);
        
        tf2.setBounds(140, 20, 600, 30);
        p.add(tf2);
        
        l5.setBounds(100, 240, 200, 30);
        p.add(l5);
        
        l13.setBounds(300, 240, 40, 30);
        p.add(l13);
        
        c1.setBounds(340, 240, 60, 30);
        p.add(c1);
        
        l14.setBounds(410, 240, 50, 30);
        p.add(l14);
        
        c2.setBounds(460, 240, 100, 30);
        p.add(c2);
        
        l15.setBounds(570, 240, 40, 30);
        p.add(l15);
        
        c3.setBounds(610, 240, 60, 30);
        p.add(c3);
        
        l6.setBounds(100, 290, 200, 30);
        p.add(l6);
        
        r1.setBounds(300, 290, 60, 30);
        p.add(r1);
        
        r2.setBounds(450, 290, 90, 30);
        p.add(r2);
        
        l7.setBounds(100, 340, 200, 30);
        p.add(l7);
        
        tf3.setBounds(300, 340, 400, 30);
        p.add(tf3);
        
        l8.setBounds(100, 390, 200, 30);
        p.add(l8);
        
        r3.setBounds(300, 390, 100, 30);
        p.add(r3);
        
        r4.setBounds(450, 390, 100, 30);
        p.add(r4);
        
        r5.setBounds(635, 390, 100, 30);
        p.add(r5);
        
        
        l9.setBounds(100, 440, 200, 30);
        p.add(l9);
        
        tf4.setBounds(300, 440, 200, 30);
        p.add(tf4);
        
        l10.setBounds(100, 490, 200, 30);
        p.add(l10);
        
        tf5.setBounds(300, 490, 400, 30);
        p.add(tf5);
        
        l11.setBounds(100, 540, 200, 30);
        p.add(l11);
        
        tf6.setBounds(300, 540, 400, 30);
        p.add(tf6);
        
        l12.setBounds(100, 590, 400, 30);
        p.add(l12);
        
        tf7.setBounds(300, 490, 400, 30);
        p.add(tf7);
        
        b1.setBounds(620, 660, 80, 30);
        p.add(b1);
        
      //  b1.addActtionLintener(this);
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 800);
        jf.setLocation(500, 90);
        jf.setVisible(true);
        c.add(p);
    }
   
    
    public static void main(String args[])
    {
        SignUp z = new SignUp();
        z.SignUp();
    }
}
    

 
    /*
    public void actionPerformed(ActionEvent ae)
    {
        String a = tf1.getText();
        String b = tf2.getText();
        
        String a1 = (String)c1.getSelectedItem();
        String a2 = (String)c2.getSelectedItem();
        String a3 = (String)c3.getSelectedItem();
        
        String x = null;
        if(r1.isSelected())
        {
            x="Male";
        }
        else if(r2.isSelected())
        {
            x="Female";
        }
        
        String b1 = tf3.getText();
        
        String d=null;
        if(r3.isSelected())
        {
            d="Married";
        }
        else if(r4.isSelected())
        {
            d="Unmarried";        
        }
        else if(r5.isSelected())
        {
            d="Other";
        }
        
        String d1 = tf4.getText();
        
        String d2 = tf5.getText();
        
        String d3 = tf6.getText();
        
        String d4 = tf7.getText();
        
        try
        {
            if(tf1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your Name");
            }
            else if(tf2.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Father's Name");
            }
            else if(tf3.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your EmailId");
            }
            else if(tf4.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your Adress");
            }
            else if(tf5.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your City");
            }
            else if(tf6.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your Pincode");
            }
            else if(tf7.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your State");
            }
            else
            {
                conn n = new conn();
                String q1 = "insert into Signup values('"+a+"','"+b+"','"+a1+"','"+a2+"','"+a3+"','"+x+"','"+b1+"','"+d+"','"+d1+"','"+d2+"','"+d3+"','"+d4+"')";
                n.s.executeUpdate(q1);
                
                new SignUp2().setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error: "+e);
        }
        
    }*/