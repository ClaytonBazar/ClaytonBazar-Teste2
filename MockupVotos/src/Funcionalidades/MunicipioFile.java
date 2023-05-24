/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import mockupvotos.Candidato;
import mockupvotos.Municipio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luisv
 */
public class MunicipioFile {
    // Usado para escrever os dados no ficheiro
    private ObjectOutputStream write = null;
    // Usado para ler os dados do ficheiro
    private ObjectInputStream read = null;
    // Criar o ficheiro 
    private File fileMunicipio = new File("municipio.dat");
    private ArrayList<Municipio> listaMunicipio = new ArrayList<>();

    // Regista um novo municipio
    public void registarMunicipio(Municipio municipio) {
        try {
            // Verificar se o ficheiro existe
            if (fileMunicipio.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileMunicipio));
                // Adicionar os dados ao ArrayList lista de municipions
                listaMunicipio = (ArrayList<Municipio>) read.readObject();
                // Fechar o Stream
                read.close();
            }

            // Adicionar o novo municipio à lista
            listaMunicipio.add(municipio);
            write = new ObjectOutputStream(new FileOutputStream(fileMunicipio));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaMunicipio);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Municipio registado com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    // Retorna um ArrayList com os municipio
    public ArrayList<Municipio> listarMunicipio() {
        try {
            // Verificar se o ficheiro existe
            if (fileMunicipio.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileMunicipio));
                // Adicionar os dados ao ArrayList lista de municipio
                listaMunicipio = (ArrayList<Municipio>) read.readObject();
                // Fechar o Stream
                read.close();
                return listaMunicipio;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao Listar Municipios: " + e.getMessage());
        }
        return null;
    }
    
    // Remover municipio
    public void removeMunicipio(String provincia){
        boolean encontrado = false;
          try {
            // Verificar se o ficheiro existe
            if (fileMunicipio.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileMunicipio));
                // Adicionar os dados ao ArrayList lista de municipios
                listaMunicipio = (ArrayList<Municipio>) read.readObject();
                // Fechar o Stream
                read.close();
                
                for (int i = 0; i < listaMunicipio.size(); i++){
                    // Verificar se existe um municipio com o nome passado como parâmetro
                    if (listaMunicipio.get(i).getProvincia().equalsIgnoreCase(provincia)){
                        // Remover o índice do arrayList caso a provincia seja igual
                        listaMunicipio.remove(i);
                        encontrado = true;
                    }
                }
            }

            if (encontrado){
            write = new ObjectOutputStream(new FileOutputStream(fileMunicipio));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaMunicipio);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Municipio removido com sucesso!");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        
    }
}
