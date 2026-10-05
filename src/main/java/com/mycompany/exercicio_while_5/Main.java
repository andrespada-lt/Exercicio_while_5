package com.mycompany.exercicio_while_5;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int i;
        i = 34;

        while (i <= 56) {
            JOptionPane.showMessageDialog(null,"as vezes de i pares= " + i);
            i =i+ 2;
        }
    }
}