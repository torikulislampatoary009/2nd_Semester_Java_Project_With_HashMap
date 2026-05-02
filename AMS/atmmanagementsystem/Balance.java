
package atmmanagementsystem;

//import static atmmanagementsystem.Cash.Opin;
//import static atmmanagementsystem.Cash.f;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Balance extends JFrame implements ActionListener{
    
    JTextField ac,pin;
    JButton next,back;
    static int f=0;
    Balance(){
        getContentPane().setBackground(Color.GRAY.brighter().brighter());
        setLayout(null);
        
        
        JLabel eAC= new JLabel("Enter A.C");
        eAC.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,20));
        eAC.setForeground(Color.BLUE.darker());
        eAC.setBounds(250,250,150,30);      
        add(eAC);   
        
        ac=new JTextField();
        ac.setBounds(400,258,150, 20);
        add(ac);
        
           
        
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
        
        
       /* if(f==1){
            
         JLabel succes= new JLabel(" Withdrawl Succesful");
         succes.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
         succes.setForeground(Color.GREEN.darker());
         succes.setBounds(190,450,400,30);      
         add(succes);  
         
        }*/
        
        if(f==1){
            
         JLabel succes= new JLabel("Incorrect Pin");
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
         if(pin.getText().equals(Cash.Opin)){
             setVisible(false);
             new ShowB();
         }
         else if(pin.getText().isEmpty()){
             
         }
         else{
             f=1;
             setVisible(false);
             new Balance();
         }       
     }
     else{
         setVisible(false);
         new Main();
     }
   }
}
