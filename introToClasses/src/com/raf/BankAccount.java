package com.raf;

public class BankAccount {

    private long accNumber;
    private long accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

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