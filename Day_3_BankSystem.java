class Account{
    String owner;
    double balance;
    Account(String a, double b){
        owner = a;
        balance = b;
    }
    void deposit(double amount){
        balance += amount;

    }void showBalance(){
        System.out.println("Owner; "+ owner + " Balance: "+ balance);

    }
}

class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(String a, double b, double c){
        super(a,b);
        interestRate = c;
    }@Override 
   void  showBalance(){
    System.out.println(owner + " - Savings - Balance: " + balance + ", Interest: " + interestRate + "%");
   }void addInterest(){
     balance = balance + (balance * interestRate / 100);
   }
}

class  LoanAccount extends Account{
    double debt;
    LoanAccount(String a, double b,double c){
        super(a,b);
        debt = c;
    }@Override
    void showBalance(){
System.out.println(owner + " - Loan - Balance: " + balance + ", Debt: " + debt);
    }void makePayment(double amount){
      if(amount>debt){
        System.out.println("Payment exceeds debt");

      }  else{
        debt = debt- amount;
      } 
    }
}

class BankSystem{
    public static void main(String[] args){
    SavingsAccount s = new SavingsAccount("Nyan", 1000.0, 5.0);
LoanAccount l = new LoanAccount("Aung", 500.0, 2000.0);

s.deposit(500.0);
s.addInterest();
s.showBalance();

l.deposit(200.0);
l.makePayment(500.0);
l.makePayment(3000.0);
l.showBalance();

}
}
