package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LerPerguntas {
    List<String> lista = new ArrayList<>();
    File file = new File("/home/antonio/IdeaProjects/sistema_pet/src/formulario.txt");

    public List<String> carregarPerguntas() {
    lista.clear();
    try (BufferedReader br = new BufferedReader(new FileReader(file))){
        String linha;
        while ((linha = br.readLine()) != null) {
            if (!linha.trim().isEmpty()) {
                lista.add(linha);
            }
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        return lista;
    }
    public void imprimir() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public void tamanho() {
        System.out.println(lista.size());
    }
//method que vai imprimir a pergunta, e toda vez que for chamado, vai perguntar a proxima.
    int p = 0;
    public void pergunta() {
        System.out.println(lista.get(p));
        p++;
    }

}
