import bank.Account;                                           //Package
import java. util. Scanner; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;                                           //Swings
interface banking                                               //Interface    
{
public void openAccount();
}
class Details extends Thread implements banking 
{  
String accno;  
String name;  
String acc_type;    
Scanner sc = new Scanner (System.in);    
public void openAccount()
{  
System.out.println("Enter Account No: ");
accno = sc.next();
System.out.println("Enter Account type: ");    
acc_type = sc.next();  
System.out.println("Enter Name: ");  
name = sc.next();    
}  
} 
class BankDetails extends Details                            //Inheritance
{
BankDetails()                                                //Constructor
{
System.out.println(" ");
}
protected void Accountdetails()                              //Access Modifier(keyword)
{    
System.out.println("Account no.: " + accno);  
System.out.println("Account type: " + acc_type); 
System.out.println("Name of account holder: " + name);  
}
public final boolean search(String ac_no)                   //Final keyword
{  
if (accno.equals(ac_no))
{  
Accountdetails();
return (true);  
}  
return (false);  
}       
} 
class A                                                                                          
{
static                                                        //static
{
System.out.println("-----------------------------------********************-------------------------");
}   
void display()
{
System.out.println("-----------------------------------********************-------------------------");                                                    
}
void display(int a)                                          //Method Overloading
{
System.out.println("\t\t\t\t\t THANK YOU");     
display();                                                          //calls default this. display()  
}
}
class Thank extends A
{
void display()                                                  //Method Overriding
{
System.out.println("-----------------------------------********************--------------------------");
}
}
public class BankingApplication                                                       //Class
{ 
BankingApplication()
{
JFrame f;
JLabel l1;
JButton b;
Font fon;
f=new JFrame("BANK");
l1 = new JLabel("Banking Application");
l1.setBounds(100,250,700,100);
fon=new Font("Arial",Font.BOLD,44);
l1.setFont(fon);
b=new JButton("LOGIN");
b.setBounds(280,370,100,50);
f.add(l1);
f.add(b);
f.setSize(720,720);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener(){                        
public void actionPerformed(ActionEvent e)
{
f.dispose();
}
});
}
public static void main(String args[])                                                                      
{  
new BankingApplication();
Scanner sc = new Scanner(System.in); 
System.out.println("How many number of customers do you want to enter the details");  
int n = sc.nextInt();  
BankDetails b[] = new BankDetails[n];                    //object
Account a[]=new Account[n];  
for(int i=0;i<b.length;i++)
{
b[i] = new BankDetails();  
b[i].openAccount(); 
a[i] = new Account(); 
a[i].details();
}
int ch; 
do
{
System.out.println("\n ***Banking System Application***");  
System.out.println("1.Display all account details \n2.Search by Account number \n3.Exit ");  
System.out.println("Enter your choice: ");  
ch = sc.nextInt();     
switch (ch) 
{  
case 1:  
for (int i = 0; i <b.length; i++)
{  
b[i].Accountdetails();  
}  
break;  
case 2:  
System.out.println("Enter account no. you want to search: ");  
String ac_no = sc.next();  
boolean found = false; 
for (int i = 0; i < b.length; i++)
{  
found = b[i].search(ac_no);  
if (found) 
{  

break;  
}  
} 
if (!found) 
{  
System.out.println("Search failed! Account doesn't exist..!!");  
}  
break; 
case 3:  
System.out.println("exit");  
break; 
}  
}while(ch!=3); 
A ab=new A();
ab.display();
ab.display(1); 
Thank t=new Thank();
t.display();  
} 
}
