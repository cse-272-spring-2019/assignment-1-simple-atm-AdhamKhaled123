/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class Screen1 extends JFrame {
    JButton zero=new JButton("0");
    JButton one=new JButton("1");
    JButton two=new JButton("2");
    JButton three=new JButton("3");
    JButton four=new JButton("4");
    JButton five=new JButton("5");
    JButton six=new JButton("6");
    JButton seven=new JButton("7");
    JButton eight=new JButton("8");
    JButton nine=new JButton("9");
    JLabel display=new JLabel();
    JButton Submit=new JButton("Submit");

  
    

public Screen1(Client c){
    MyATM m=new MyATM(c);
    setLayout(null);
    zero.setBounds(250, 350, 90, 35);
    one.setBounds(150, 150, 90, 35);
    two.setBounds(250, 150, 90, 35);
    three.setBounds(350, 150, 90, 35);
    four.setBounds(150, 220, 90, 35);
    five.setBounds(250, 220, 90, 35);
    six.setBounds(350, 220, 90, 35);
    seven.setBounds(150, 290, 90, 35);
    eight.setBounds(250, 290, 90, 35);
    nine.setBounds(350, 290, 90, 35);
    display.setBounds(250, 50, 300, 80);
    Submit.setBounds(450, 400, 90, 35);
    add(zero);
    add(one);
    add(two);
    add(three);
    add(four);
    add(five);
    add(six);
    add(seven);
    add(eight);
    add(nine);
    add(display);
    add(Submit);
      zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"0");            
            } 
         });
      one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"1");            
            } 
         });
       two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"2");            
            } 
         });
         three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"3");            
            } 
         });
           four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"4");            
            } 
         });
             five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"5");            
            } 
         });
               six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"6");            
            } 
         });
                 seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"7");            
            } 
         });
                   eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"8");            
            } 
         });
             nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           display.setText(display.getText()+"9");            
            } 
         });
       
              Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             m.withdraw(display.getText()); 
             setVisible(false);
                
            } 
         });
              
       
}

}


