import java.util.*;
class atm{
    Scanner sc=new Scanner(System.in);
    int Balance=0;
    public void password(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Now creat your password for further process");
        System.out.print("Enter password in numbers:");
        int password=sc.nextInt();
        System.out.println("your password is successfully created");
        System.out.print("Enter your password:");
        int check=sc.nextInt();
        if (password==check){
            menu();
        }
        else{
            System.out.println("Enter a valid password");
        }
        
    }
    public void menu(){
       
        System.out.println("1.Deposite Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        int menu=sc.nextInt();
       
        if(menu==1){
           deposite();
        }
        else if(menu==2){
            Withdraw();
        }
        else if(menu==3){
            checkbalance();
        }
        else if(menu==4){
               return;
        }
        else{
            System.out.println("Enter a valid number");
        }
        
    }
    public void deposite(){
        System.out.println("Enter your Deposite Amount:");
        int amount=sc.nextInt();
        Balance=Balance+amount;
        System.out.println("Your amount is successfully added");
        menu();
    }
    public void Withdraw(){
        System.out.println("Enter Amount:");
            int amount=sc.nextInt();
            if(amount<Balance){
                Balance=Balance-amount;
                System.out.println("your Balance is " + Balance);
                menu();
            }
            else{
                System.out.println("out of balance");
                menu();
            }
    }
    public void checkbalance(){
        System.out.println(Balance);
        menu();
    }
    
}
public class atminterface {
    public static void main(String [] args){
        atm obj=new atm();
        obj.password();
    }
}
