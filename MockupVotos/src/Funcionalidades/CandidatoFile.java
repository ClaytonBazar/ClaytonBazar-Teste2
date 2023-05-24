/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import mockupvotos.Candidato;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luisv
 */
public class CandidatoFile {

    // Usado para escrever os dados no ficheiro
    private ObjectOutputStream write = null;
    // Usado para ler os dados do ficheiro
    private ObjectInputStream read = null;
    // Criar o ficheiro 
    private File fileCandidatos = new File("candidatos.dat");
    private ArrayList<Candidato> listaCandidatos = new ArrayList<>();

    // Regista um novo candidato
    public void registarCandidato(Candidato candidato) {
        try {
            // Verificar se o ficheiro existe
            if (fileCandidatos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileCandidatos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaCandidatos = (ArrayList<Candidato>) read.readObject();
                // Fechar o Stream
                read.close();
            }

            // Adicionar o novo candidato à lista
            listaCandidatos.add(candidato);
            write = new ObjectOutputStream(new FileOutputStream(fileCandidatos));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaCandidatos);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Candidato registado com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    // Retorna um ArrayList com os candidatos
    public ArrayList<Candidato> listarCandidatos() {
        try {
            // Verificar se o ficheiro existe
            if (fileCandidatos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileCandidatos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaCandidatos = (ArrayList<Candidato>) read.readObject();
                // Fechar o Stream
                read.close();
                return listaCandidatos;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao Listar Candidatos: " + e.getMessage());
        }
        return null;
    }
    
    // Remover candidato 
    public void removerCandidato(String numeroBI){
        boolean encontrado = false;
          try {
            // Verificar se o ficheiro existe
            if (fileCandidatos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileCandidatos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaCandidatos = (ArrayList<Candidato>) read.readObject();
                // Fechar o Stream
                read.close();
                
                for (int i = 0; i < listaCandidatos.size(); i++){
                    // Verificar se existe um número do bi igual ao número passado como parâmetro
                    if (listaCandidatos.get(i).getBi().equalsIgnoreCase(numeroBI)){
                        // Remover o índice do arrayList caso o número seja igual
                        listaCandidatos.remove(i);
                        encontrado = true;
                    }
                }
            }

            if (encontrado){
            write = new ObjectOutputStream(new FileOutputStream(fileCandidatos));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaCandidatos);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Candidato removido com sucesso!");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        
    }

}
