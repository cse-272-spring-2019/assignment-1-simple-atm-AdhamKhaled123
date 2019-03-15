
package main;

import java.util.ArrayList;


public class Client {
    private double balance;
    private String CardNo;
ArrayList<String>History=new ArrayList<>();
   int count=0;
    public Client(double balance, String CardNo) { //constructor for the client 
                                                         
        this.balance = balance;
        this.CardNo = CardNo;
    }

    public void setBalance(double balance) { //to set the balance
        this.balance = balance;
    }

    public double getBalance() {        //to get the balance
        return balance;
    }

    public String getCardNo() {    //to get the card no entered with the client
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }
    
    
    
}
