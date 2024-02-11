/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

/**
 *
 * @author Mohit
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener{
    JButton newCustomer,customer;JButton searchroom,update;
    JButton rooms,rupdate ;
    JButton dept,allemp;
    JButton managerInfo;
    JButton pu,checkout,logout;
    Reception()
    {
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(350,200,800,570);
        setVisible(true);
        
        newCustomer =new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms =new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
        
        dept =new JButton("Department");
        dept.setBounds(10,110,200,30);
        dept.setBackground(Color.BLACK);
        dept.setForeground(Color.WHITE);
        dept.addActionListener(this);
        add(dept);
        
         allemp =new JButton("All Employee");
        allemp.setBounds(10,150,200,30);
        allemp.setBackground(Color.BLACK);
        allemp.setForeground(Color.WHITE);
        allemp.addActionListener(this);
        add(allemp);
         
        customer=new JButton("Customer Info");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(customer);
        
        managerInfo=new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        checkout=new JButton("CheckOut");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);
        
        update=new JButton("Pending Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        rupdate=new JButton("Room Status");
        rupdate.setBounds(10,350,200,30);
        rupdate.setBackground(Color.BLACK);
        rupdate.setForeground(Color.WHITE);
        rupdate.addActionListener(this);
        add(rupdate);
        
        pu=new JButton("Pick Up");
        pu.setBounds(10,390,200,30);
        pu.setBackground(Color.BLACK);
        pu.setForeground(Color.WHITE);
        pu.addActionListener(this);
        add(pu);
        
        searchroom=new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);
        
        logout=new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/tt.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
         
        
        
        
        
        
        
        
        
        
   
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==newCustomer)
        {
            setVisible(false);
            new AddCustomer();
        }
       else if(ae.getSource()==rooms)
        {
            setVisible(false);
            new Room();
        }
        
        else if(ae.getSource()==dept)
        {
            setVisible(false);
            new Department();
        }
        else if(ae.getSource()==allemp)
        {
            setVisible(false);
            new EmployeeInfo();
        }
        else if(ae.getSource()==managerInfo)
        {
            setVisible(false);
            new ManagerInfo();
        }
        else if(ae.getSource()==customer)        {
            setVisible(false);
            new CustInfo();
        }
        else if(ae.getSource()==searchroom)        {
            setVisible(false);
            new SearchR();
        }
        else if(ae.getSource()==update)        {
            setVisible(false);
            new UpdateCheck();
        }
        else if(ae.getSource()==rupdate)        {
            setVisible(false);
            new UpdateRoom();
        }
        else if(ae.getSource()==pu)        {
            setVisible(false);
            new PickUp();
        }
        else if(ae.getSource()==checkout)        {
            setVisible(false);
            new CheckOut();
        }
        else if(ae.getSource()==logout)        {
            setVisible(false);
           // new CheckOut();
        }
    }
    public static void main(String args[])
    {
        new  Reception();
    }
            
    
}
