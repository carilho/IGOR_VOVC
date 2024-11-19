package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("AB12345",0);
        account1.deposit(2000);
        account1.deposit(20300);
        account1.withdraw(2001);
        account1.withdraw(24000);
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance; }

        public double deposit (double amount){
            balance +=amount;
            System.out.println("Сумма на балансе: " + balance);
            return balance;
        }

        public double withdraw (double amount){
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Сумма на балансе: " + balance);
                return balance;
            } else {
                System.out.println("Недостаточно средств на счёте");
                return balance;
            }
        }
    }
