/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desenho;


import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;

public class MeuPainel extends JPanel {

    public void  paintComponent(Graphics g){
        super.paintComponent(g);
        //retangulo maior
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 100, 300);
        //retangulo
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 100, 300);
       
        //posicoes das bolas
        int yRed = 60;
        int yYellow = 160;
        int yGreen = 260;
        //Bla vermelha
        g.setColor(Color.red);
        g.fillOval(60,yYellow , 80, 80);
        //Bola verde
        g.setColor(Color.GREEN);
        g.fillOval(60,yGreen , 80, 80);
        //Retangulo pequeno
        g.setColor(Color.WHITE);
        g.fillRect(150, 150, 100 , 200);
        //retangulo pequeno
        g.setColor(Color.BLACK);
        g.drawRect(150, 150, 100 , 200);
        //Bola amarela
        g.setColor(Color.YELLOW);
        g.fillOval(60, 60, 80, 80);
        // Bola preta
        g.setColor(Color.BLACK);
        g.fillOval(160, 160, 80, 80);
        g.drawOval(160, 260, 80, 80);
    }
    
}
