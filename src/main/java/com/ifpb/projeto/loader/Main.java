package com.ifpb.projeto.loader;

import com.ifpb.projeto.infra.Leitor;

public class Main {

    private static final String caminho = "dados/";

    public static void main(String[] args) {
        String nomeArquivo = "TCE-PB-SAGRES-Licitacao_Esfera_Municipal.txt";
        Leitor leitor = new Leitor();
        leitor.gerarArquivo(caminho + nomeArquivo);
    }

}
