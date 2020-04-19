package atm.simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignUp2 {
   
    JFrame jf = new JFrame("Login");
    Container c = jf.getContentPane();
    JPanel p = new JPanel();
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b1;
    JRadioButton r1,r2,r3,r4;
    JComboBox c1,c2,c3,c4,c5;
    JTextField t1,t2,t3;
    
    public void SignUp2()
    {
    /*setFont(new Font("System", Font.BOLD ,22));
        Font f = getFont();
        FontMetrics fm =getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM Page 2");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        pad  = String.format("%", w, "s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM Page 2");
      */  
        l1= new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        l2= new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,10));
        
        l3= new JLabel("Category:");
        l3.setFont(new Font("Raleway",Font.BOLD,10));
        
        l4= new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,10));
        
        l5= new JLabel("Education:");
        l5.setFont(new Font("Raleway",Font.BOLD,10));
        
        l6= new JLabel("Qualification:");
        l6.setFont(new Font("Raleway",Font.BOLD,10));
        
        l7= new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,10));
        
        l8= new JLabel("Pan Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,10));
        
        l9= new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,10));
        
        l10= new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,10));
        
        l11= new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,10));
        
        l12= new JLabel("Form no.:");
        l12.setFont(new Font("Raleway",Font.BOLD,13));
        
        b1 = new JButton("Next");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setForeground(Color.WHITE);
        
        r1= new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,13));
        
        r2= new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,13));
        
        r3= new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,13));
        
        r4= new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,13));
        
        String Religion[]={"Hindu","Muslim","Sikh","Cristian","Other"};
        c1= new JComboBox(Religion);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        
        String Category[]={"General","OBC","SC","ST","Other"};
        c2= new JComboBox(Category);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(Color.BLACK);
        c2.setForeground(Color.WHITE);
        
        String Income[]={"NULL","1,50,000","2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3= new JComboBox(Income);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(Color.BLACK);
        c3.setForeground(Color.WHITE);
        
        String Education[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4= new JComboBox(Education);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(Color.BLACK);
        c4.setForeground(Color.WHITE);
        
        String Occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        c5= new JComboBox(Occupation);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(Color.BLACK);
        c5.setForeground(Color.WHITE);
        
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        
        t3=new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        p.setLayout(null);
        
        
        l12.setBounds(700, 10, 60, 30);
        p.add(l12);
        
        t3.setBounds(760, 10, 60, 30);
        p.add(t3);
        
        l1.setBounds(280, 30, 600, 40);
        p.add(l1);
        
        l2.setBounds(100, 120, 320, 30);
        p.add(l2);
        
        c1.setBounds(350, 120, 320, 30);
        p.add(c1);
        
        l3.setBounds(100, 170, 100, 30);
        p.add(l3);
        
        c2.setBounds(350, 170, 320, 30);
        p.add(c2);
        
        l4.setBounds(100, 220, 100, 30);
        p.add(l4);
        
        c3.setBounds(350, 220, 320, 30);
        p.add(c3);
        
        l5.setBounds(100, 270, 150, 30);
        p.add(l5);
        
        c4.setBounds(350, 270, 320, 30);
        p.add(c4);
        
        l6.setBounds(100, 290, 150, 30);
        p.add(l6);
        l7.setBounds(100, 340, 150, 30);
        p.add(l7);
        
        c5.setBounds(350, 340, 320, 30);
        p.add(c5);
        
        l8.setBounds(100, 390, 150, 30);
        p.add(l8);
        
        t1.setBounds(350, 390, 320, 30);
        p.add(t1);
        
        l9.setBounds(100, 440, 100, 30);
        p.add(l9);
        
        t2.setBounds(350, 440, 320, 30);
        p.add(t2);
        
        l10.setBounds(100, 490, 150, 30);
        p.add(l10);
        
        r1.setBounds(350, 490, 100, 30);
        p.add(r1);
        
        r2.setBounds(460, 490, 100, 30);
        p.add(r2);
        
        l11.setBounds(100, 540, 180, 30);
        p.add(l11);
        
        r3.setBounds(460, 540, 180, 30);
        p.add(r3);
        
        b1.setBounds(570, 600, 100, 30);
        p.add(b1);
        
        
        //b1.addActionListener(this);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 800);
        jf.setLocation(500, 90);
        jf.setVisible(true);
        jf.setBackground(Color.WHITE);
        jf.setVisible(true);
        c.add(p);
    
    }
    
    public static void main(String []args)
    {
        SignUp2 z = new SignUp2();
        z.SignUp2();
    }
}

    
    
 /*   public void acionPerformed(ActionEvent ae)
    {
        String a = (String)c1.getSelectedItem();
        String b = (String)c2.getSelectedItem();
        String c = (String)c3.getSelectedItem();
        String d = (String)c4.getSelectedItem();
        String e = (String)c5.getSelectedItem();
        
        String f = t1.getText();
        String g = t2.getText();
        
        String h = null;
        if(r1.isSelected())
        {
            h="Yes";
        }
        else if(r2.isSelected())
        {
            h="No";
        }
        
        String i = null;
        if(r3.isSelected())
        {
            i="Yes";
        }
        else if (r4.isSelected())
        {
            i="No";
        }
        
        String j = t3.getText();
        
        try
        {
            if(t1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your Pan Number");
            }
            else if(t2.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Your Aadhar Number");
            }
            else if(t3.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter Form No.");
            }
            else
            {
                conn n = new conn();
                String q1 = "insert into SignUp2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"') ";
                n.s.executeUpdate(q1);
                
                new SignUp3().setVisible(true);
                setVisible(false);
                
            }
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
            System.out.println("error: "+e1);
        }
        
    }*/