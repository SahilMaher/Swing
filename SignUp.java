import javax.swing.*;
import java.awt.event.*;  
class SignUp
{

static JTextField name1;
static JFrame jf;

public static void main(String args[])
{
jf=new JFrame();
jf.setLayout(null);
JLabel name =new JLabel("User Name");
name1=new JTextField();
JLabel pass=new JLabel("Enter Password");
JTextField pass1=new JTextField();

JLabel num=new JLabel("Enter Number");
JTextField num1=new JTextField();
JButton jb=new JButton("Submit");

jf.add(pass);
jf.add(jb);
jf.add(pass1);
jf.add(name1);
jf.add(name);
jf.add(num1);
jf.add(num);
 jb.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
           String nameget=name1.getText().toString();
JOptionPane.showMessageDialog(jf,nameget);
        }  
    });  
name1.setBounds(160,65,110,20);
name.setBounds(60,65,110,20);

pass1.setBounds(160,90,110,20);
pass.setBounds(60,90,110,20);

num1.setBounds(160,115,110,20);
num.setBounds(60,115,110,20);
jb.setBounds(120,150,90,30);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jf.setVisible(true);

jf.setSize(700,700);


         
        
}

}