package com.raf;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car opel = new Car();

        porsche.setModel("911");
        System.out.println("Porshe model is: " + porsche.getModel());
        opel.setModel("Vectra");
        opel.setColour("Green");
        opel.setEngine("1.6 16V");
        System.out.println("Opel model: " + opel.getModel());
        System.out.println("Opel colour is: " + opel.getColour());
        System.out.println("Opel engine is: " + opel.getEngine());



        BankAccount johnDoe = new BankAccount(123456789, 10000, "John Doe",
                "johndoe@gmail.com", "0-111-222-333");


        System.out.println("New bank account belongs to: " + johnDoe.getCustomerName() + ", email address: " +
                            johnDoe.getCustomerEmail() + ", phone number: " + johnDoe.getCustomerPhoneNumber());
        System.out.println(johnDoe.getCustomerName() + " current account balance is: " + johnDoe.getAccBalance());

        johnDoe.depositFunds(2500);

        System.out.println(johnDoe.getCustomerName() + " current account balance is: " + johnDoe.getAccBalance());

        johnDoe.withdrawFunds(12000);

        System.out.println(johnDoe.getCustomerName() + " current account balance is: " + johnDoe.getAccBalance());

        johnDoe.withdrawFunds(50000);

        System.out.println(johnDoe.getCustomerName() + " current account balance is: " + johnDoe.getAccBalance());

        BankAccount testAcc = new BankAccount();
        System.out.println("testAcc name is: " + testAcc.getCustomerName());
    }
}
