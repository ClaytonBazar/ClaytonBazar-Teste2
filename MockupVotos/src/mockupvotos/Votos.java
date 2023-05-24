/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockupvotos;

/**
 *
 * @author Dell
 */
public class Votos {
    private boolean isBranco;
    private boolean isValido;
    private boolean dataVoto;
    private int vot;

    public Votos(boolean isBranco, boolean isValido, boolean dataVoto, int vot) {
        this.isBranco = isBranco;
        this.isValido = isValido;
        this.dataVoto = dataVoto;
        this.vot = vot;
    }

    public boolean isIsBranco() {
        return isBranco;
    }

    public void setIsBranco(boolean isBranco) {
        this.isBranco = isBranco;
    }

    public boolean isIsValido() {
        return isValido;
    }

    public void setIsValido(boolean isValido) {
        this.isValido = isValido;
    }

    public boolean isDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(boolean dataVoto) {
        this.dataVoto = dataVoto;
    }

    public int getVot() {
        return vot;
    }

    public void setVot(int vot) {
        this.vot = vot;
    }

    
}
