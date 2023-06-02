package bank;                                  //package
import java.util.Scanner; 
public class Account
{
public void details()
{
long balance; 
long amount;
Scanner sc = new Scanner(System.in);   
System.out.println("Enter Balance: ");  
balance = sc.nextLong(); 
System.out.println("Balance: " + balance);   
System.out.println("Enter the amount you want to deposit: "); 

amount = sc.nextLong();  
balance = balance + amount; 
System.out.println("Balance before withdrawal: " + balance); 
System.out.println("Enter the amount you want to withdraw: ");  
amount = sc.nextLong();  
if (balance >= amount)
{  
balance = balance - amount;  
System.out.println("Balance after withdrawal: " + balance);  
} 
else
{  
System.out.println("Your balance is less than " +amount); 
System.out.println("transaction failed"); 
} 
try                                              //exception (Making the thread sleep for 1 second after each deposit )                                          
{
Thread.sleep(500);
}
catch (InterruptedException e) 
{
e.printStackTrace();
}
}
}