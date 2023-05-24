/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desenho;

import javax.swing.JFrame;

public class Exercicio2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaforo");
        MeuPainel painel = new MeuPainel();

        frame.add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.setVisible(true);

    }

}
