
package universitymanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UniversityServer extends JFrame implements ActionListener{
    JButton Back;
    JMenuBar mb;
    JMenu info,add,leave;
    JMenuItem facultyInfo,StudentInfo,addFaculty,addStudent,leaveFaculty,leaveStudent;
    UniversityServer(){
    
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        mb=new JMenuBar();
        setJMenuBar(mb);
        
        info=new JMenu("Information");
        info.setForeground(Color.RED);
        info.setBackground(Color.RED);
        mb.add(info);
        
        facultyInfo=new JMenuItem("Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        info.add(facultyInfo);
        
        StudentInfo=new JMenuItem("Student Information");
        StudentInfo.setBackground(Color.WHITE);
        StudentInfo.addActionListener(this);
        info.add(StudentInfo);
        
        add=new JMenu("Add");
        add.setForeground(Color.RED);
        add.setBackground(Color.RED);
        mb.add(add);
        
        addFaculty=new JMenuItem("Add New Faculty");
        addFaculty.setBackground(Color.WHITE);
        addFaculty.addActionListener(this);
        add.add(addFaculty);
        
        addStudent=new JMenuItem("Add New Student");
        addStudent.setBackground(Color.WHITE);
        addStudent.addActionListener(this);
        add.add(addStudent);
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i4=image.getImage().getScaledInstance(160, 140, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel label2=new JLabel(i5);
        label2.setBounds(1,1,160,140);
        add(label2);
        
        JLabel username= new JLabel("FENI UNIVERSITY SERVER");
        username.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,70));
        username.setForeground(Color.BLACK);
        username.setBounds(170,1,950,100);      
        add(username);
        
        leave=new JMenu("Leave");
        leave.setForeground(Color.RED);
        leave.setBackground(Color.RED);
        mb.add(leave);
        
        leaveFaculty=new JMenuItem("Faculty");
        leaveFaculty.setBackground(Color.WHITE);
        leave.add(leaveFaculty);
        
        leaveStudent=new JMenuItem("Student");
        leaveStudent.setBackground(Color.WHITE);
        leave.add(leaveStudent);
        
        
       /* StudentInfo=new JButton("Student Information");
        StudentInfo.setBounds(1330,13,180,30);
        StudentInfo.setFont(new Font("Arial",Font.BOLD,14));
        StudentInfo.setBackground(Color.BLUE);
        StudentInfo.setForeground(Color.WHITE);
        StudentInfo.addActionListener(this);
        add(StudentInfo);
        
        FacultyInfo=new JButton("Faculty Information");
        FacultyInfo.setBounds(1130,13,180,30);
        FacultyInfo.setFont(new Font("Arial",Font.BOLD,14));
        FacultyInfo.setBackground(Color.BLUE);
        FacultyInfo.setForeground(Color.WHITE);
        FacultyInfo.addActionListener(this);
        add(FacultyInfo);
        
        addNewFaculty=new JButton("Add New Faculty");
        addNewFaculty.setBounds(1530,13,170,30);
        addNewFaculty.setFont(new Font("Arial",Font.BOLD,14));
        addNewFaculty.setBackground(Color.BLUE);
        addNewFaculty.setForeground(Color.WHITE);
        addNewFaculty.addActionListener(this);
        add(addNewFaculty);
     
        
        addNewStudent=new JButton("Add New Student");
        addNewStudent.setBounds(1730,13,170,30);
        addNewStudent.setFont(new Font("Arial",Font.BOLD,14));
        addNewStudent.setBackground(Color.BLUE);
        addNewStudent.setForeground(Color.WHITE);
        addNewStudent.addActionListener(this);
        add(addNewStudent);*/
        
        Back=new JButton("Back");
       // cancel.setBounds(1780,50,120,30);
        Back.setBackground(Color.LIGHT_GRAY);
        Back.setForeground(Color.RED);
        Back.addActionListener(this);
        mb.add(Back);
     
        setSize(2000,1200);
        setVisible(true);
   }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==Back) {
           setVisible(false);
           new Main();
       }
       else if(ae.getSource()==addStudent){
           setVisible(false);
           new AddStudent();
       }
       else if(ae.getSource()==StudentInfo){
           setVisible(false);
           new InterSID();
       }
     }
    
   /* public static void main(String[] args) {
        new UniversityServer();
    }*/
    
}
