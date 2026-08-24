package test;

import service.Verificador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
        static void main() {
            Scanner sc = new Scanner(System.in);
            Verificador verificandor = new Verificador();
            File form = new File("/home/antonio/IdeaProjects/sistema_pet/src/formulario.txt");
            try (FileReader fr = new FileReader(form); BufferedReader bf = new BufferedReader(fr)){
                String linha;
//                linha = bf.readLine();
                while((linha = bf.readLine()) != null){
                    System.out.println(linha);

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("============ Seja bem vindo ao PetManager ============");
            System.out.println("Ações: ");
            int opcao = 0;
            try {
                while (opcao != 6){
                    System.out.println("1. Cadastrar um novo pet\n" +
                            "2. Alterar os dados do pet cadastrado\n" +
                            "3. Deletar um pet cadastrado\n" +
                            "4. Listar todos os pets cadastrados\n" +
                            "5. Listar pets por algum critério (idade, nome, raça)\n" +
                            "6. Sair");
                    System.out.print("Escolha uma opção: ");
                    String escolha = sc.next();

                    opcao = Integer.parseInt(escolha);


                    if (verificandor.verificando(opcao) == false){
                        System.out.print("Por favor digite um número valido: ");
                        opcao = sc.nextInt();
                        if (verificandor.verificando(opcao) == false) {
                            System.out.println("Encerrando programa...");
                            break;
                        } else if (verificandor.verificando(opcao) == true) {
                            System.out.println("Argumento válido encontrado " + opcao);

                        }
                    } else {
                        System.out.println(opcao);
                        switch (opcao) {
                            case 1:
                                System.out.println("cadastrar pet");

                                break;
                            case 2:
                                System.out.println("alterar dados do pet");
                                break;
                            case 3:
                                System.out.println("deletar um pet cadastrado");
                                break;
                            case 4:
                                System.out.println("listar pets");
                                break;

                            case 5:
                                System.out.println("listar pets por um criterio");
                                break;

                            case 6:
                                System.out.println("Encerrando o programa...");
                                break;
                            default:
                                System.out.println("inválido");
                                break;
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Argumento ilegal, encerrando programa");
            } catch (NumberFormatException e) {
                System.out.println("argumento ilegal, encerrando programa");
            }

        }
    }
