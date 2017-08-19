package com.ifpb.projeto.infra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Leitor {

    private FileReader leitorArquivo;
    private List<String> titulos, palavras;
    private BufferedReader leitorBuffer;
    private StringTokenizer tokenTitulos, tokenPalavras;
    private File arquivoAuxiliar, arquivoCriado;
    private FileWriter metEscrita;
    private PrintWriter escritor;

    public Leitor() {
        this.titulos = new ArrayList<>();
        this.palavras = new ArrayList<>();
    }

    public void gerarArquivo(String nomeArquivo) {

        try {

            arquivoAuxiliar = new File(nomeArquivo);

            if (arquivoAuxiliar.exists()) {
                leitorArquivo = new FileReader(nomeArquivo);
                leitorBuffer = new BufferedReader(leitorArquivo);

                tokenTitulos = new StringTokenizer(leitorBuffer.readLine(), "|");
                while (tokenTitulos.hasMoreTokens()) {
                    titulos.add(tokenTitulos.nextToken());
                }

                arquivoCriado = new File("novosDados.txt");
                if (!arquivoCriado.exists()) {
                    arquivoCriado.createNewFile();
                }

                arquivoCriado.delete();
                arquivoCriado.createNewFile();

                metEscrita = new FileWriter(arquivoCriado, false);
                escritor = new PrintWriter(metEscrita);

                String palavra = "";

                while ((palavra = leitorBuffer.readLine()) != null) {

                    tokenPalavras = new StringTokenizer(palavra, "|");

                    while (tokenPalavras.hasMoreTokens()) {
                        String p = tokenPalavras.nextToken();
                        palavras.add(p);
                    }

                }

                int cont = 0;
                for (int i = 0; i < palavras.size(); i++) {
                    
                    if (cont == titulos.size()) {
                        cont = 0;
                        System.out.println("");
                        escritor.println("");
                    }
                    
                    escritor.println(titulos.get(cont) + ": " + palavras.get(i));
                    System.out.println(titulos.get(cont) + ": " + palavras.get(i));
                    cont++;
                }  

                System.out.println("Escrito com sucesso!");

                leitorArquivo.close();
                leitorBuffer.close();
                metEscrita.close();
                escritor.close();
                
            } else {
                System.out.println("Arquivo não encontrado!");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
