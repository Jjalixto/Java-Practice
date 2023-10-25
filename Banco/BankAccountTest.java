package Banco;

public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.depositToCurrentAccount(500.0);
        account1.depositToSavingsAccount(300.0);

        account1.withdraw(200.0, "current");
        account1.withdraw(100.0,"savings");

        account1.checkTotalBalance();
        account2.checkTotalBalance();

        System.out.println("Total de cuentas creadas: " + BankAccount.getTotalAccounts());
        System.out.println("Total de dinero almacenado: $"+ BankAccount.getTotalMoneyStored());
    }
}
