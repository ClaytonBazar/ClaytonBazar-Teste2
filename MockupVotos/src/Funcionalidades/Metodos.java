/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import javax.swing.JComboBox;
import mockupvotos.Municipio;

/**
 *
 * @author Dell
 */
public class Metodos {
    JComboBox jcombo = new JComboBox<>();
    public void adicionarItem(Municipio M){
        jcombo.addItem(M);
    }
}
