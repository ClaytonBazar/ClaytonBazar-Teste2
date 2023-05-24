/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockupvotos;

/**
 *
 * @author Dell
 */
public class Municipio {
    private String descricao, provincia;
    private int quantRecenseados;

    public Municipio(String descricao, String provincia, int quantRecenseados) {
        this.descricao = descricao;
        this.provincia = provincia;
        this.quantRecenseados = quantRecenseados;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getQuantRecenseados() {
        return quantRecenseados;
    }

    public void setQuantRecenseados(int quantRecenseados) {
        this.quantRecenseados = quantRecenseados;
    }
    
    
}
