
package atmmanagementsystem;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class ShowB extends JFrame{
   
    ShowB(){
        
     getContentPane().setBackground(Color.GRAY.brighter().brighter());
     setLayout(null);  
        
    
     JLabel Amount= new JLabel("Your Current Amount is : 0");
     Amount.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,40));
     Amount.setForeground(Color.BLUE.darker());
     Amount.setBounds(50,200,650,40);      
     add(Amount);
     
     
     
     JLabel label= new JLabel("You are a Poor");
     label.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,50));
     label.setForeground(Color.BLUE.darker());
     label.setBounds(50,300,600,40);      
     add(label);
     
        
    setLocation(500,250);
    setSize(800,600);
    setVisible(true);  
  }
}
