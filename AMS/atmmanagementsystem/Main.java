
package atmmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener{
    
    JButton cashW,balanceI;
    Main(){
        
      getContentPane().setBackground(Color.GRAY.brighter());
      setLayout(null);
           
      
     JLabel welcome= new JLabel("Welcome");
     welcome.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,70));
     welcome.setForeground(Color.BLUE.darker());
     welcome.setBounds(340,90,400,70);      
     add(welcome);    
                 
     JLabel atm= new JLabel("ATM");
     atm.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,70));
     atm.setForeground(Color.BLUE.darker().darker());
     atm.setBounds(410,10,350,50);      
     add(atm);    
      
     
      cashW=new JButton("CASH WITHDRAWAL");
      cashW.setBounds(50,450,350,40);
      cashW.setFont(new Font("Arial",Font.BOLD,30));
      cashW.setBackground(Color.WHITE.darker().darker().darker());
      cashW.setForeground(Color.GRAY.brighter().brighter());
      cashW.addActionListener(this);
      add(cashW);
        
     
      balanceI=new JButton("BALANCE INQUIRY");
      balanceI.setBounds(500,450,350,40);
      balanceI.setFont(new Font("Arial",Font.BOLD,30));
      balanceI.setBackground(Color.WHITE.darker().darker().darker());
      balanceI.setForeground(Color.GRAY.brighter().brighter());
      balanceI.addActionListener(this);
      add(balanceI);
         
      
     setSize(1000,700);
     setLocation(500,200);   
     setVisible(true);
    }
 public void actionPerformed(ActionEvent e){
     
     if(e.getSource()==cashW){
         setVisible(false);
         new Cash();
     }
     else{
         setVisible(false);
         new Balance();
     }
 }


/*public static void main(String args[]){
  new Main();
}*/
}
