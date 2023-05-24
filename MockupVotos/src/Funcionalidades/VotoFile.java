/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import mockupvotos.Votos;

/**
 *
 * @author ESTUDANTE
 */
public class VotoFile {
     // Usado para escrever os dados no ficheiro
    private ObjectOutputStream write = null;
    // Usado para ler os dados do ficheiro
    private ObjectInputStream read = null;
    // Criar o ficheiro 
    private File fileVotos = new File("votos.dat");
    private ArrayList<Votos> listaVotos = new ArrayList<>();

    // Regista um novo candidato
    public void registarVoto(Votos voto) {
        try {
            // Verificar se o ficheiro existe
            if (fileVotos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileVotos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaVotos = (ArrayList<Votos>) read.readObject();
                // Fechar o Stream
                read.close();
            }

            // Adicionar o novo candidato à lista
            listaVotos.add(voto);
            write = new ObjectOutputStream(new FileOutputStream(fileVotos));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaVotos);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Voto registado com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    // Retorna um ArrayList com os candidatos
    public ArrayList<Votos> listarVotos() {
        try {
            // Verificar se o ficheiro existe
            if (fileVotos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileVotos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaVotos = (ArrayList<Votos>) read.readObject();
                // Fechar o Stream
                read.close();
                return listaVotos;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao Listar Candidatos: " + e.getMessage());
        }
        return null;
    }
    
    // Remover candidato 
    public void removerVotos(String numeroBI){
        boolean encontrado = false;
          try {
            // Verificar se o ficheiro existe
            if (fileVotos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileVotos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaVotos = (ArrayList<Votos>) read.readObject();
                // Fechar o Stream
                read.close();
                
               /* for (int i = 0; i < listaVotos.size(); i++){
                    // Verificar se existe um número do bi igual ao número passado como parâmetro
                    if (listaVotos.get(i)equalsIgnoreCase()){
                        // Remover o índice do arrayList caso o número seja igual
                        listaVotos.remove(i);
                        encontrado = true;
                    }
                }*/
            }

            if (encontrado){
            write = new ObjectOutputStream(new FileOutputStream(fileVotos));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaVotos);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Voto removido com sucesso!");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        
    }

}
