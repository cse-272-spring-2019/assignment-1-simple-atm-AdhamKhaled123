
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MyGUI extends JFrame {   //first screen
        JLabel label=new JLabel("Card no:");
        JButton btn=new JButton("Login");
        JTextField txt=new JTextField(50); //50 is the number of letters to accept(size).
        Client c=new Client(1000,"123"); // have to put balance and card number because of the constructor made in client.

    public MyGUI() { //I made a constructor so when i make a new MyGUI it will have all of this features.
        setLayout(null);     
        label.setBounds(200,100,50,60);
        add(label);
        txt.setBounds(250,119,100,23);
        add(txt);
        btn.setBounds(265,160,70,25);
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(txt.getText().equals(c.getCardNo()))  //if the card no is valid it will enter the age home.
              {
                  Home m=new Home(c);  //if his card number is valid he will enter the home and MyGUI will close.
                  m.setVisible(true); //to open home.
                  m.setSize(600,650);  //size of page home.
                  setVisible(false); //to close the first screen MyGUI.
              }
              else{
                  JOptionPane.showMessageDialog(null,"ERROR!!"); //if he enetered the wrong card number
              }
                  
            }
        });
       
         
    }

        
        
    
}
