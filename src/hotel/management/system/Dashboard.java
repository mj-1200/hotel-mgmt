
package hotel.management.system;

/**
 *
 * @author Mohit
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    Dashboard()
    {
        setBounds(0,0,1550,1000);
        setLayout(null);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/wert.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        image.setBounds(0,0,1550,1000);
        
        JLabel text= new JLabel("HOTEL GROUPS WELCOMES YOU :)");
        text.setBounds(400,60,1000,50);
        text.setFont(new Font("Tahoma",Font.PLAIN,50));
        text.setForeground(Color.white);
        
        image.add(text);
        
        JMenuBar mb=new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb); 
        
        JMenu hotel=new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception=new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        
        JMenu admin=new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        
        JMenuItem addEmployee=new JMenuItem("Add Employee");
        addEmployee.addActionListener(this);
        admin.add(addEmployee);
        JMenuItem addRooms=new JMenuItem("Add Rooms");
        addRooms.addActionListener(this);
        admin.add(addRooms);
        JMenuItem addDriver=new JMenuItem("Add Driver");
        addDriver.addActionListener(this);
        admin.add(addDriver);
        
        
        
        
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Add Employee"))
          new AddEmployee();
        if(ae.getActionCommand().equals("Add Rooms"))
          new AddRooms();
         if(ae.getActionCommand().equals("Add Driver"))
          new AddDriver();
         if(ae.getActionCommand().equals("RECEPTION"))
          new Reception();
                

    }
    public static void main(String args[])
    {
        new Dashboard();
    }
    
}
