
package universitymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShowSInfo extends JFrame implements ActionListener{
    
   // InterSID ob;
    JLabel SName,Sid,SMN,SFN,dob,mobile,sB,sD;
    JButton back;
    ShowSInfo(String id){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //new InterSID();
        SName= new JLabel("Student Name      : "+AddStudent.sList.get(id).name);
        SName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SName.setForeground(Color.BLACK);
        SName.setBounds(20,40,700,30);      
        add(SName);
        
        Sid= new JLabel("Student ID        : "+AddStudent.sList.get(id).id);
        Sid.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        Sid.setForeground(Color.BLACK);
        Sid.setBounds(20,80,700,30);      
        add(Sid);
        
        sB= new JLabel("Student Batch      : "+AddStudent.sList.get(id).batch);
        sB.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sB.setForeground(Color.BLACK);
        sB.setBounds(20,120,700,30);      
        add(sB);
        
        
        sD= new JLabel("Student Department  : "+AddStudent.sList.get(id).dep);
        sD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sD.setForeground(Color.BLACK);
        sD.setBounds(20,160,700,30);      
        add(sD);
        
        SMN= new JLabel("Mother Name      : "+AddStudent.sList.get(id).MotherName);
        SMN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SMN.setForeground(Color.BLACK);
        SMN.setBounds(20,200,700,30);      
        add(SMN);
        
        SFN= new JLabel("Father Name      : "+AddStudent.sList.get(id).FatherName);
        SFN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SFN.setForeground(Color.BLACK);
        SFN.setBounds(20,240,700,30);      
        add(SFN);
        
        
        dob= new JLabel("Date of Birth     : "+AddStudent.sList.get(id).dob);
        dob.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        dob.setForeground(Color.BLACK);
        dob.setBounds(20,280,700,30);      
        add(dob);
        
        mobile= new JLabel("Mobile           : "+AddStudent.sList.get(id).mobile);
        mobile.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        mobile.setForeground(Color.BLACK);
        mobile.setBounds(20,320,700,30);      
        add(mobile);
        
         
        back=new JButton("Back");
        back.setBounds(20,360,80,30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,700);
        setLocation(500,250);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==back){
           setVisible(false);
           //new Frame1(false);
           new UniversityServer();
        }
    }
   /* public static void main(String[] args) {
        new ShowSInfo();
    }*/
}
