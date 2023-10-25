package Banco;

import java.util.Random;

public class BankAccount {

    private double currentAccountBalance;
    private double savingsAccountBalance;

    private static int totalAccounts = 0;
    private static double totalMoneyStored = 0.0;

    // constructor bankAccount
    public BankAccount() {
        generateAccountNumber();
        this.currentAccountBalance = 0.0;
        this.savingsAccountBalance = 0.0;
        totalAccounts++; // esto nos avisa cuantas veces se esta llamando al constructor bankAccount
    }

    // metodo privado para generar un numero de cuanta de 10 digitos aleatorios de
    // acuerdo al anunciado
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(); // el metodo constructor StringBuilder contiene un texto y
        for (int i = 0; i < 10; i++) { // con metodo append se une este al momento de imprimir
            sb.append(random.nextInt(10)); // recuerda que el metodo append combina filas de dos a mas marcos de datos
        }
        return sb.toString();
    }

    // metodo getter para el saldo de la cuenta corriente
    public double getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    // metodo getter para el saldo de la cuenta de ahorros
    public double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    // metodo para depositar dinero en la cuenta corriente
    public void depositToCurrentAccount(double amount) {
        currentAccountBalance += amount;
        totalMoneyStored += amount;
        System.out.println("Desposito en la cuenta corriente: $" + amount);
    }

    // metodo para depositar dinero en la cuenta de ahorros
    public void depositToSavingsAccount(double amount) {
        currentAccountBalance += amount;
        totalMoneyStored += amount;
        System.out.println("Desposito en la cuenta de ahorros: $" + amount);
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("current")) {
            if (amount <= currentAccountBalance) {
                currentAccountBalance -= amount;
                totalMoneyStored -= amount;
                System.out.println("Se esta retirando de la cuenta corriente: $" + amount);
            } else {
                System.out.println("Saldo insuficiente en la cuenta corriente.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (amount <= savingsAccountBalance) {
                savingsAccountBalance -= amount;
                totalMoneyStored += amount;
                System.out.println("Se esta retirando de la cuenta de ahorros: $" + amount);
            } else {
                System.out.println("Saldo insuficiente en la cuenta de ahorros.");
            }
        } else {
            System.out.println("Se especifico un tipo de cuenta no valida");
        }
    }

    //metodo para ver el estado de cuenta total de dinero de la cuenta corriente y en la cuenta de ahorros 
    public void checkTotalBalance(){
        System.out.println("Balance de la cuenta corriente: $" + currentAccountBalance);
        System.out.println("Balance de la cuenta de ahorros: $" + savingsAccountBalance);
    }

    //metodo estatico para obtener el total de cuentas creadas 
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    //metodo para obtener el total de diner almacenado de todas las cuentas
    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }
}
