package com.gigan.polymorphism;

interface payment{
    void pay();
}

class CreditCard implements payment{
    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }
}

class SEPAtransaction implements payment{
    @Override
    public void pay() {
        System.out.println("SEPA Payment");
    }
}

class EWallet implements payment{
    @Override
    public void pay() {
        System.out.println("Paypal Payment");
    }
}

class Cryptomoney implements payment{
    @Override
    public void pay() {
        System.out.println("Bitcoin Payment");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard();
        myCreditCard.pay();

        SEPAtransaction mySEPAtransaction = new SEPAtransaction();
        mySEPAtransaction.pay();

        EWallet myeWallet = new EWallet();
        myeWallet.pay();

        Cryptomoney myCryptoMoney = new Cryptomoney();
        myCryptoMoney.pay();
    }
}
