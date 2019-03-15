
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home extends JFrame{
   JButton withdraw=new JButton("Withdraw");
   JButton Deposit=new JButton("Deposit");
   JButton BalanceInquiry=new JButton("BalanceInquiry");
   JButton Next=new JButton("Next");
   JButton Previous=new JButton("Previous");
   JLabel label=new JLabel();
   MyATM m;

    public Home(Client c) { //made a constructor inorder to enter home must have a client
         m=new MyATM(c);
        setLayout(null); //free format to make me able to design 
        withdraw.setBounds(100, 100, 100, 30);
        add(withdraw);
        Deposit.setBounds(100, 200, 100, 30);
        add(Deposit);
        BalanceInquiry.setBounds(100, 300, 118, 30);
        add(BalanceInquiry);
        Next.setBounds(100, 400, 100, 30);
        add(Next);
        Previous.setBounds(100, 500, 100, 30);
        add(Previous);
        label.setBounds(280, 300, 100, 30);
        add(label);
        
         BalanceInquiry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(m.getCurrentBalance());
            }
            
            
    });
         withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Screen1 n=new Screen1(c);
             n.setVisible(true); //to open screen.
             n.setSize(650,550);//to control size of the screen.
            } 
         });
         Deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Screen2 n=new Screen2(c);
             n.setVisible(true); //to open screen.
             n.setSize(650,550);//to control size of the screen.
            } 
         });
              Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(m.Next());
            }
            
            
    });
             Previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(m.Previous());
            }
               
    });
         
         
    }

}


    

