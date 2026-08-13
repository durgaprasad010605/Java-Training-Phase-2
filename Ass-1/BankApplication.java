interface BankAccountOperations {
    void depositAmount(double amount);
    void withdrawAmount(double amount);
    void checkBalance();
    void displayAccountDetails();
}

abstract class BankAccount {

    int accountNumber;
    String accountHolderName;
    String accountType;
    double balance;
    long phoneNumber;

    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    BankAccount(int accountNumber, String accountHolderName,String accountType, double balance, long phoneNumber) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.phoneNumber = phoneNumber;

        totalAccounts++;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdrawAmount(double amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Phone Number: " + phoneNumber);
    }

    abstract void calculateInterest();
}


class SavingsAccount extends BankAccount implements BankAccountOperations {

    int interestRate;
    int minimumBalance;

    static int savingsAccountcount = 0;

    SavingsAccount(int accountNumber, String accountHolderName,double balance, long phoneNumber,int interestRate, int minimumBalance) {

        super(accountNumber, accountHolderName, "Savings",balance, phoneNumber);

        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;

        savingsAccountcount++;
    }

    @Override
    public void depositAmount(double amount) {
        super.depositAmount(amount);
    }

    @Override
    public void withdrawAmount(double amount) {

        if (balance - amount >= minimumBalance) {
            super.withdrawAmount(amount);
        } else {
            System.out.println(
                    "Cannot withdraw. Minimum balance requirement not met.");
        }
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
    }

    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Minimum Balance: " + minimumBalance);
    }

    @Override
    void calculateInterest() {
    }
}


class CurrentAccount extends BankAccount implements BankAccountOperations {

    int overdraftLimit;
    int minimumBalance;

    static int currentAccountcount = 0;

    CurrentAccount(int accountNumber, String accountHolderName,double balance, long phoneNumber,int overdraftLimit, int minimumBalance) {

        super(accountNumber, accountHolderName, "Current",balance, phoneNumber);

        this.overdraftLimit = overdraftLimit;
        this.minimumBalance = minimumBalance;

        currentAccountcount++;
    }

    @Override
    public void depositAmount(double amount) {
        super.depositAmount(amount);
    }

    @Override
    public void withdrawAmount(double amount) {

        if (balance - amount >= -overdraftLimit) {
            super.withdrawAmount(amount);
        } else {
            System.out.println("Cannot withdraw. Overdraft limit exceeded.");
        }
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
    }

    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Minimum Balance: " + minimumBalance);
    }

    @Override
    void calculateInterest() {
    }
}


public class BankApplication {

    public static void main(String[] args) {

        SavingsAccount s1 =new SavingsAccount(101, "rdp1",10000, 9876543210L, 5, 1000);

        SavingsAccount s2 =new SavingsAccount(102, "rdp2",15000, 9876543211L, 5, 1000);

        SavingsAccount s3 =new SavingsAccount(103    , "rdp3",20000, 9876543212L, 5, 1000);

        SavingsAccount s4 =new SavingsAccount(104       , "rdp4",80000, 9876887489L, 5, 1000);

        SavingsAccount s5 =new SavingsAccount(105, "rdp5",40000, 9876947394L, 5, 1000);


        CurrentAccount c1 =new CurrentAccount(201, "abc1",25000, 9876543213L, 5000, 2000);

        CurrentAccount c2 =new CurrentAccount(202, "abc2",30000, 9876543214L, 5000, 2000);

        CurrentAccount c3 =new CurrentAccount(203, "abc3",35000, 9876543215L, 5000, 2000);

        CurrentAccount c4 =new CurrentAccount(204, "abc4",40000, 9876543216L, 5000, 2000);

        CurrentAccount c5 =new CurrentAccount(205, "abc5", 45000, 9876543217L, 5000, 2000);


        s1.depositAmount(5000);

        s2.withdrawAmount(2000);

        s3.checkBalance();

        s4.displayAccountDetails();

        c1.depositAmount(10000);

        c2.withdrawAmount(15000);

        c3.checkBalance();

        c1.displayAccountDetails();


        BankAccount.totalAccounts =SavingsAccount.savingsAccountcount + CurrentAccount.currentAccountcount;

        System.out.println("Total Accounts: "+ BankAccount.totalAccounts);

        System.out.println("bank name: "+ BankAccount.bankName);
    }
}