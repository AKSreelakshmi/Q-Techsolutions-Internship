import java.util.Scanner;

class BasicBankingSystem 
{
    static class BankAccount 
	{
        String name;
        double balance;
        BankAccount(String name, double initialBalance) 
		{
            this.name = name;
            this.balance = initialBalance;
        }
        void deposit(double amt) 
		{
            if (amt > 0) 
			{
                balance += amt;
                System.out.println("deposited: " + amt);
            } 
			else 
			{
                System.out.println("invalid amount");
            }
            System.out.println("current balance: " + balance);
        }
        void withdraw(double amt) 
		{
            if (amt > 0 && amt <= balance) 
			{
                balance -= amt;
                System.out.println("you withdrew: " + amt);
            } 
			else if (amt > balance) 
			{
                System.out.println("insufficient balance");
            } 
			else 
			{
                System.out.println("invalid amount");
            }
            System.out.println("current balance: " + balance);
        }
        void displayBalance() 
		{
            System.out.println("holder name: " + name);
            System.out.println("current balance: " + balance);
        }
    }
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("enter the holder's name: ");
        String name = s.nextLine();
        System.out.print("enter the initial balance: ");
        double initialBalance = s.nextDouble();
        BankAccount account = new BankAccount(name, initialBalance);
        while (true) 
		{
            System.out.println("Basic Banking System");
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.display balance");
            System.out.println("4.exit");
            System.out.print("select an option: ");
            int choice = s.nextInt();
            switch (choice) 
			{
                case 1:
                    System.out.print("enter the deposit amount: ");
                    double depositAmt = s.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("enter the withdrawal amount: ");
                    double withdrawalAmt = s.nextDouble();
                    account.withdraw(withdrawalAmt);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    s.close();
                    return;
                default:
                    System.out.println("please try again");
            }
        }
    }
}
