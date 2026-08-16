import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro {
        static void main() {
            Scanner sc = new Scanner(System.in);
            File form = new File("/home/antonio/IdeaProjects/sistema_pet/src/formulario.txt");
            try (FileReader fr = new FileReader(form); BufferedReader bf = new BufferedReader(fr)){
                String linha;
                while((linha = bf.readLine()) != null){
                    System.out.println(linha);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n");
            int opcao = 0;
            while (opcao != 6){
                System.out.println("1. Cadastrar um novo pet\n" +
                        "2. Alterar os dados do pet cadastrado\n" +
                        "3. Deletar um pet cadastrado\n" +
                        "4. Listar todos os pets cadastrados\n" +
                        "5. Listar pets por algum critério (idade, nome, raça)\n" +
                        "6. Sair");
                opcao = sc.nextInt();


            }
        }
    }
