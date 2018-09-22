package com.raf;

public class BankAccount {

    private long accNumber;
    private long accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this(0000000, 0, "Default Name", "Default  Email", "Default Phone NUmber");
    }

    public BankAccount(long accNumber, long accBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void depositFunds(long funds) {
        this.accBalance += funds;
        System.out.println("Your account balance now is: " + this.accBalance);
    }

    public void withdrawFunds(long withdrawal) {
        if (withdrawal < this.accBalance) {
            this.accBalance -= withdrawal;
            System.out.println("Your account balance now is: " + this.accBalance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}