import java.util.*;
import java.text.*;

class Main{
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        
       
        System.out.println("Welcome to USAA Bank! Please select an option:\n1.Consumer Account\n2.Commercial Account\n3.Create Account");
        
        int n = Integer.parseInt(sc.nextLine());

        
        switch(n){
            case 1: 
                    System.out.println("Email");
                    String email = sc.nextLine();
                    System.out.println("Password");
                    String password = sc.nextLine();
                    CurrentAccount CA = new CurrentAccount(name,acc,bal,start);
                    CA.calculateInterest(5,end);
                    break;
            case 2: SavingsAccount SA = new SavingsAccount(name,acc,bal,start);
                    SA.calculateInterest(12,end);
                    break;
            case 3: System.out.println("Welcome! Please enter the following details:");
                    System.out.println("Account type:\n1.Consumer\n2.Commercial");
                    int type = Integer.parseInt(sc.nextLine());

                    System.out.println("First Name:");
                    String first_name = sc.nextLine();

                    System.out.println("Last Name:");
                    String last_name = sc.nextLine();

                    System.out.println("Email:");
                    email = sc.nextLine();

                    System.out.println("Phone:");
                    String phone = sc.nextLine();

                    System.out.println("Password:");
                    password = sc.nextLine();

                    System.out.println("Initial deposit(Minimum $50.00 requiered):");
                    Double depost = Double.parseDouble(sc.nextLine());

                    if(type == 1){

                    }else if(type == 2){
                        
                    }

        }
        
        }catch(ParseException pe){
            System.out.println(pe);
        }
    
    }   
}