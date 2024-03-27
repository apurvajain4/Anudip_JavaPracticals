import java.util.Scanner;
class InsufficientFundsException extends Exception {
public InsufficientFundsException(String message) {
super(message);
}
}
class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
this.balance = initialBalance;
}
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited: $" + amount);
}
public void withdraw(double amount) throws InsufficientFundsException {
if (amount > balance) {
throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
}
balance -= amount;
System.out.println("Withdrawn: $" + amount);
}
public double getBalance() {
return balance;
}
}
public class SimpleBankingApplication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial balance: ");
double initialBalance = scanner.nextDouble();
BankAccount account = new BankAccount(initialBalance);
while (true) {
System.out.println("¥n1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int option = scanner.nextInt();
switch (option) {
case 1:
System.out.print("Enter deposit amount: ");
double depositAmount = scanner.nextDouble();
account.deposit(depositAmount);
break;
case 2:
System.out.print("Enter withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
try {
account.withdraw(withdrawalAmount);
} catch (InsufficientFundsException e) {
System.out.println("Error: " + e.getMessage());
}
break;
case 3:
System.out.println("Current Balance: $" + account.getBalance());
break;
case 4:
System.out.println("Exiting...");
scanner.close();
System.exit(0);
break;
default:
System.out.println("Invalid option. Please choose again.");
}
}
}
}