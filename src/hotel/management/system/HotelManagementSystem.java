
package hotel.management.system;

/**
 *
 * @author Mohit
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener {
HotelManagementSystem()
{ 
  
    setBounds(100,100,1366,565);
    setLayout(null);
    setVisible(true);
    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(0,0,1366,565);
    add(image);
    
    JLabel text= new JLabel("HOTEL MANAGEMENT SYSTEM");
    text.setBounds(20, 430, 1000, 90);
    
    text.setForeground(Color.WHITE);
    text.setFont(new Font("serif",Font.PLAIN,50) );
    image.add(text);  
    
    JButton next=new JButton("Next");
    next.setBounds(1150, 450, 150, 50);
    next.setBackground(Color.WHITE);
    next.setForeground(Color.BLACK);
    next.addActionListener(this);
    
    next.setFont(new Font("serif",Font.PLAIN,50) );
    image.add(next);  
    
    
    while(true)
    {
        text.setVisible(false);
        try
        {
            Thread.sleep(500);
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        text.setVisible(true);
        try
        {
            Thread.sleep(500);
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}

@Override
public void actionPerformed(ActionEvent e)
{
    setVisible(false);
    new Login();
}
   
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }
    
}
