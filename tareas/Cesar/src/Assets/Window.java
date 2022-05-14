/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assets;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Admin
 */
public class Window extends JFrame implements ActionListener{
    Font font = new Font("Impact", 4, 22);
    Color color1 = new Color(212, 220, 107);
     //objetos en pantalla
       JLabel label1 = new JLabel("Cesar´s Secret Code ");
       JLabel l2 = new JLabel("codigo");
       JButton b2 = new JButton();
       JButton b1 = new JButton();
       JTextField codeField = new JTextField();
        JTextArea tocode = new JTextArea("Escribe algo...",6,20);
         JTextArea output = new JTextArea(6,20);
    Cesar cesar = new Cesar();
    public Window() {
        setSize(800, 600);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
        
     }
    
    private void init()
    {
       //customizacion de objetos 
       label1.setFont(font);
       label1.setBounds(270, 0, 300, 50);
       l2.setBounds(10, 38, 50, 25);
       b1.setText("Cifrar");
       b1.setBackground(color1);
       b1.setBounds(270,50,100,20);
       b1.addActionListener(this);
       b2.addActionListener(this);   
       b2.setText("Descifrar");
       b2.setBackground(color1);
       b2.setBounds(385,50,100,20);
       tocode.setBounds(50, 75,300 , 450);
       tocode.setLineWrap(true);//para los saltos de linea automaticos 
        output.setBounds(400, 75,300 , 450);
        output.setEditable(false);
       output.setLineWrap(true);//para los saltos de linea automaticos 
       codeField.setBounds(50,40, 50, 20);
       //adds 
        add(label1);
        add(b1);
        add(b2);
        add(tocode);
        add(output);
        add(codeField);
        add(l2);
        getContentPane().setBackground(new Color(123, 224, 201));
        // cosas del frama
        getContentPane().setLayout(null);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1){
           cesar.setCodigo(Integer.parseInt(codeField.getText()));
           cesar.secret(tocode.getText());
           output.setText(cesar.EncriptedString);
           getContentPane().repaint();
    }
    if (e.getSource() == b2){
           cesar.setCodigo(Integer.parseInt(codeField.getText()));
           cesar.unsecret(tocode.getText());
           output.setText(cesar.EncriptedString);
           getContentPane().repaint();
    }
  }

    
    
}
