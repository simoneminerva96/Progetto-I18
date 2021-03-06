package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;

public class Phone extends JFrame {
    private JButton callButton;
    private JButton closeButton;

    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num0;
    private JButton asterisk;
    private JButton hashtag;

    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton Delete;

    public Phone(){
        this.add(mainPanel);
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("1");
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("2");
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("3");
            }
        });num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("4");
            }
        });num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("5");
            }
        });num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("6");
            }
        });num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("7");
            }
        });num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("8");
            }
        });num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("9");
            }
        });num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("0");
            }
        });hashtag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("#");
            }
        });asterisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("*");
            }
        });
           Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.replaceRange("", textArea.getText().length()-1, textArea.getText().length());
            }
        });

        callButton.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)  {
                if ("1234".equals(textArea.getText())) {
                    textArea.replaceRange("", 0, textArea.getText().length());
                    textArea.append("Calling...\n");
                    try{
                        textArea.append(ReadFile.lettura());
                    }
                    catch(IOException ie){
                        System.out.println("ERRORE LETTURA");
                    }


                }
                else{
                    textArea.replaceRange("", 0, textArea.getText().length());
                    textArea.append("Number no-existent");
                }
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.replaceRange("", 0, textArea.getText().length());

            }
        });

    }

}
