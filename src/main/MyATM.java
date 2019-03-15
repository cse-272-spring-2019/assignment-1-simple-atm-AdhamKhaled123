
package main;

import javax.swing.JOptionPane;


public class MyATM  {
    Client c;
    
    
    
    public MyATM(Client c) {
        this.c = c;
    }

        
  public void withdraw(String amount){
      double x=Double.parseDouble(amount); //to change amount from string to double.
      if(c.getBalance()>=x){
          double current=c.getBalance();
          c.setBalance(current-x);
          c.History.add("withdraw    "+amount);
          c.count ++;
}
      else{
           JOptionPane.showMessageDialog(null,"INVALID!!");
      }
               

  }
    public void Deposit(String amount){
      double x=Double.parseDouble(amount);// to change amount from string to double.
      double current=c.getBalance();
      c.setBalance(current+x);
                c.History.add("deposit    "+amount);
                c.count ++;

      
  }
  public String getCurrentBalance(){
        return c.getBalance()+"";    //+"" to change from double to string.
    
  }
  public String Next(){
     if (c.count==4)
             return "no more";
     else
         return c.History.get(++c.count);
      
  }
    public String Previous(){
         if (c.count==0)
             return "no more";
     else
         return c.History.get(--c.count); 
      
  }
  
}

