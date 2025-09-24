package com.aleix.exercices.advanced.exercice_13;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Banco simple (POO + colecciones)
 * Clase CuentaBancaria con saldo y métodos depositar() y retirar().
 * Simula operaciones de varias cuentas usando un HashMap.
 */

class BankAccount {

    private String iban;
	private double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(double amount,  BankAccount destination) {
        balance -= amount;
        destination.balance += balance;
    }
}

public class Exercise_13 {
    public static void main(String[] args) {
        HashMap<String, BankAccount> accounts = new HashMap<>();
        accounts.put("Alex", new BankAccount("NL96INGB7843842861", 1000));
        accounts.put("Dylan", new BankAccount("LU940107175182615738", 2000));
    }
}
