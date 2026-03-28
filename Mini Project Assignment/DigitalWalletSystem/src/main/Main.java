package main;

import company.WalletCompany;
import models.*;

public class Main { 
    public static void main(String[] args) { 
 
        // 1. Buat company 
        WalletCompany wc = new WalletCompany("W01", "PayFast"); 
 
        // 2. Buat user 
        User u1 = new User("U01", "Alice"); 
        User u2 = new User("U02", "Bob"); 
 
        // 3. Register user 
        wc.registerUser(u1); 
        wc.registerUser(u2); 
 
        // 4. Top up 
        u1.getWallet().topUp(1000); 
        u2.getWallet().topUp(500); 
 
        // 5. Transfer 
        u1.transferTo(u2, 300); 
 
        // 6. Print semua wallet 
        wc.printAllWallets(); 
    } 
} 