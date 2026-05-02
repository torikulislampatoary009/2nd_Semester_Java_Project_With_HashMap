
package atmmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Cash extends JFrame implements ActionListener{
    
    JTextField pin,amount;
    JButton next,back;
    static String Opin="0029";
    static int f=0;
    
    Cash(){
        
        getContentPane().setBackground(Color.GRAY.brighter().brighter());
        setLayout(null);
        
        
        JLabel eAmount= new JLabel("Enter Amount");
        eAmount.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,20));
        eAmount.setForeground(Color.BLUE.darker());
        eAmount.setBounds(250,250,150,30);      
        add(eAmount);   
        
        amount=new JTextField();
        amount.setBounds(400,258,150, 20);
        add(amount);
        
           
        
        JLabel Epin= new JLabel("Enter Pin");
        Epin.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,20));
        Epin.setForeground(Color.BLUE.darker());
        Epin.setBounds(250,300,150,30);      
        add(Epin);   
           
        pin=new JPasswordField();
        pin.setBounds(400,308,150, 20);
        add(pin);
        
        next=new JButton("Next");
        next.setBounds(280,390,100,25);
        next.setFont(new Font("Arial",Font.BOLD,25));
        next.setBackground(Color.WHITE.darker().darker().darker());
        next.setForeground(Color.GRAY.brighter().brighter());
        next.addActionListener(this);
        add(next);
        
        back=new JButton("Back");
        back.setBounds(400,390,100,25);
        back.setFont(new Font("Arial",Font.BOLD,25));
        back.setBackground(Color.WHITE.darker().darker().darker());
        back.setForeground(Color.GRAY.brighter().brighter());
        back.addActionListener(this);
        add(back);
        
        
        if(f==1){
            
         JLabel succes= new JLabel(amount.getText()+" Withdrawl UnSuccesful Cause Cheak");
         succes.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
         succes.setForeground(Color.GREEN.darker());
         succes.setBounds(1,450,700,30);      
         add(succes);  
         
         JLabel Succes= new JLabel("your Balance");
         Succes.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
         Succes.setForeground(Color.GREEN.darker());
         Succes.setBounds(150,490,300,35);      
         add(Succes); 
         
        }
        
        if(f==2){
            
         JLabel succes= new JLabel(amount.getText()+" Incorrect Pin");
         succes.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
         succes.setForeground(Color.RED.darker());
         succes.setBounds(230,450,400,30);      
         add(succes); 
        }
        
        setSize(800,600);
        setLocation(500,250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
     
     if(e.getSource()==next){
         if(pin.getText().equals(Opin)){
             f=1;
             setVisible(false);
             new Cash();
         }
         else if(pin.getText().isEmpty()){
             
         }
         else{
             f=2;
             setVisible(false);
             new Cash();
         }       
     }
     else{
         setVisible(false);
         new Main();
     }
   }
    
    public static void main(String[] args) {
        new Cash();
    }
}
