/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

/**
 *
 * @author Mohit
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JTextField username,password;
    JButton login,cancel;
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel user=new JLabel("Username");
        user.setBounds(40,20,100,30);
        add(user);
        
         username =new JTextField();
        username.setBounds(150,20,150,30);
        add(username);
        
        
         JLabel pass=new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);
        
        
        password =new JTextField();
        password.setBounds(150,70,150,30);
        add(password);
        
        login=new JButton("Login");
        login.setBounds(40,150,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE); 
        login.addActionListener(this);
        add(login);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE); 
        cancel.addActionListener(this);
        add(cancel);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(350,10,200,200);
        add(image);
        
        
        
        
        setBounds(500,200,600,300);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
          String user=  username.getText();
          String pass=password.getText();
          try
          {
              Conn c=new Conn();
              String query="Select * from login where username= '" + user + "' and password= '"+ pass + "'";
              
             ResultSet rs =   c.s.executeQuery(query);
             if(rs.next())
             {
                 setVisible(false);
                 
                 new Dashboard();
                 
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                 setVisible(false);
                 
             }
              
          }
          catch(Exception e )
          {
               e.printStackTrace();
          }
            
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
