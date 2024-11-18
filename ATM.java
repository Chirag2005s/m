//GUI ATM Program
import javax.swing.*;

class ATM {
    
   public static double balance;
       // public ATM() {
       //     this.balance = 0.00;
       // }
   
       public void deposit(double amount) {
           if (amount > 0) {
               balance += amount;
               JOptionPane.showMessageDialog(null, "Successfully deposited: " + amount);
           } else {
               JOptionPane.showMessageDialog(null, "Deposit amount must be positive.");
           }
       }
   
       public void withdraw(double amount) {
           if (amount > 0 && amount <= balance) {
               balance -= amount;
               JOptionPane.showMessageDialog(null, "Successfully withdrew: " + amount);
           } else if (amount > balance) {
               JOptionPane.showMessageDialog(null, "Insufficient funds.");
           } else {
               JOptionPane.showMessageDialog(null, "Withdrawal amount must be positive.");
           }
       }
   
       public void checkBalance() {  
           JOptionPane.showMessageDialog(null, "Current balance: " + balance);
       }
   
       public static void main(String[] args) {           // Programming Start
           ATM atm = new ATM();
           String choice;
   
    JOptionPane.showMessageDialog(null,"..Welcome bank system..\n1. Full name\n2.PIN code\nNotes:- please enter step.");
    
    String a= JOptionPane.showInputDialog(null,"Enter account holder's name: ");
    int b= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter IFSC NO.: "));
   // int c= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 6-digits code: "));
    double d= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter inital balance: "));
        balance = balance+d;
	JOptionPane.showMessageDialog(null,"ACCOUNT OPEN");
	
	JOptionPane.showMessageDialog(null,"Name: "+a+"\nCurrent balance: "+d+"\nNotes:- please press ok button");
	
	JOptionPane.showInputDialog(null,"Choice Accounts\n1. Saving account\n2. Current account");
	
        do {
            choice = JOptionPane.showInputDialog(null, "Welcome " + a + "!\nChoose an option:\n1. Deposit \n2. Withdraw \n3. Check balance \n4. ATM pin change \n5. My account details \n6. More \n7. Bank about \n8. Exit");

             
        
            if (choice == null) {
                break; // Allows user to exit by closing the dialog
            }

            switch (choice) {		//switch case start 
                case "1":
                int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                if(b==c)
                {
                    String depositStr = JOptionPane.showInputDialog(null, "Enter amount to deposit:");
                    try {
                        double depositAmount = Double.parseDouble(depositStr);
                        atm.deposit(depositAmount);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
                    }
                    break;
                }
                else
                JOptionPane.showMessageDialog(null, "invalid pin.."); 
                break;   

                case "2":
                int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                  if(b==x)
                  {
                    String withdrawStr = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
                    try {
                        double withdrawAmount = Double.parseDouble(withdrawStr);
                        atm.withdraw(withdrawAmount);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
                    }
                    break;
                }
                else
                JOptionPane.showMessageDialog(null, "invalid pin..");  
                break;  

                case "3":
                int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                  if(b==y)
                  {
                    atm.checkBalance();
                    break;
                  }
                  else
                  JOptionPane.showMessageDialog(null, "invalid pin..");   
                  break; 

                case "4":
                int z=Integer.parseInt(JOptionPane.showInputDialog(null,"ATM PIN CODE: "));
                if(b==z){
                    JOptionPane.showInputDialog(null, "ATM PIN GENERATION");
                    JOptionPane.showMessageDialog(null, "ATM PIN GENERATION SUCCESSFULLY..!");
                }
                else
                    JOptionPane.showMessageDialog(null,"Try again.");
                    break;
                    
                case "5":
                int q=Integer.parseInt(JOptionPane.showInputDialog(null,"ATM PIN CODE: "));
                if(b==q){
                    JOptionPane.showMessageDialog(null, "Name: "+a+"\nInital balance: "+d+"\n");
                    //JOptionPane.showMessageDialog(null, "IFSC no.: "+b);
                    //JOptionPane.showMessageDialog(null, "Inital balance: "+d);
                }
                else
                    JOptionPane.showMessageDialog(null,"Sorry exit..!");
                    break;
               
               //case "6":
                   // More btn
                    
               case "7":
                    JOptionPane.showMessageDialog(null, "SBI Bank");
                    
                    JOptionPane.showMessageDialog(null,"SBI Bank:-\nICICI was formed in 1955 at the initiative of the World Bank, the Government of India and representatives of \nIndian industry. The principal objective was to create a development financial institution for providing medium-term and long-term project financing to Indian businesses. Until the\n late 1980s, ICICI primarily focused its activities on project finance, providing long-term funds to a variety of industrial projects. With the liberalization of the financial sector in India in the 1990s, \nICICI transformed its business from a development financial institution offering only project finance \nto a diversified financial services provider that, along with its subsidiaries and other group companies, offered a wide variety of products and \nservices. As India’s economy became more market-oriented and integrated with the world economy, ICICI capitalized on the new opportunities to provide a wider range of financial products and \nservices to a broader spectrum of clients. ICICI Bank was incorporated in 1994 as a part of the ICICI group. \nIn 1999, ICICI became the first Indian company and the first bank or financial institution from non-Japan Asia to be listed on \nthe New York Stock Exchange.");
                    break;

                    
               case "8":
                    JOptionPane.showMessageDialog(null, "Thank you for using the ATM!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");          
            }       
       
        } while (!"8".equals(choice));
    }
}
