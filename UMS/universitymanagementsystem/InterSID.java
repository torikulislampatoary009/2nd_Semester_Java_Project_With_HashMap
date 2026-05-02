
package universitymanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class InterSID extends JFrame implements ActionListener{
    
    JLabel StudentID;
    JTextField inputUID;
    JButton next;
    InterSID(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        StudentID= new JLabel("Student ID");
        StudentID.setBounds(60,140,100,20);      
        add(StudentID);
        
        inputUID=new JTextField();
        inputUID.setBounds(170,140,150, 20);
        add(inputUID);
        
        next=new JButton("next");
        next.setBounds(180,200,120,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        
        setLocation(500,250);
        setSize(600,400);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
          setVisible(false);
          new ShowSInfo(inputUID.getText());
        }
     }
    
}
