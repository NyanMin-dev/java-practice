class BankAccount{
    String ownerName;
    double balance;
     
     BankAccount(String a, double b ){
        ownerName = a;
        balance= b;
     }
     void deposit(double amount){
        balance = balance+amount;
     }
     void withdraw(double amount){
        if(amount<=balance){
      balance = balance-amount;
        }else
        System.out.println("Insufficient funds");
     }
     void showBalance(){
        System.out.println("Owner: "+ownerName+","+" Balance: "+balance);
     }
     public static void main(String[]args){
        BankAccount acc = new BankAccount("Nyan", 1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.withdraw(2000.0);
        acc.showBalance();
        
     }}
     
