package service;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidWeigthException;
import Exceptions.NullSobrenomeException;
import domain.SexoPet;
import domain.TipoPet;

import java.util.Scanner;

public class CadastroPet {
        public void cadastrarPet() {
                Scanner sc = new Scanner(System.in);

                //carregar as perguntas e inicializar a lista
                LerPerguntas lerPerguntas = new LerPerguntas();
                lerPerguntas.carregarPerguntas();

                //pergunta 1
                lerPerguntas.pergunta();
                try {
                    String nome = sc.next();
                    String sobrenome = sc.nextLine();
                    if (sobrenome == null || sobrenome == " ") {
                        throw new NullSobrenomeException("Sem sobrenome");
                    }
                } catch (NullPointerException e) {

                }
                //pergunta 2 enum
                TipoPet tipoPet;
                lerPerguntas.pergunta();
                String pergunta2 = sc.next();
                ToEnum tE = new ToEnum();

                if (tE.paraEnum(pergunta2).equals("Cachorro")) {
                        tipoPet = TipoPet.CACHORRO;
                } else if (tE.paraEnum(pergunta2).equals("Gato")) {
                        tipoPet = TipoPet.GATO;
                } else {
                        System.out.println("é foda ein");
                }

               //pergunta 3 enum
                   SexoPet sexoPet;
                   lerPerguntas.pergunta();
                   String pergunta3 = sc.next();
                   ToEnum toEnum = new ToEnum();
                   if (toEnum.paraEnumSexo(pergunta3).equals("Feminino")) {
                           sexoPet = SexoPet.FEMININO;

                        } else if (toEnum.paraEnumSexo(pergunta3).equals("Masculino")) {
                          sexoPet = SexoPet.MASCULINO;

                        } else {
                                System.out.println("tomanocuein");
                        }
                // pergunta 4

                lerPerguntas.pergunta();
                sc.nextLine();
                String endereco = sc.nextLine();
               Scanner scanner = new Scanner(endereco);
               scanner.useDelimiter(",");

               String rua = scanner.next().trim();
               String numero = scanner.next().trim();
               String cidade = scanner.next().trim();

            System.out.println(rua);
            System.out.println(numero);
            System.out.println(cidade);

                // pergunta 5
                lerPerguntas.pergunta();
                try {
                    int idade = sc.nextInt();
                    if (idade >= 20) {
                        throw new InvalidAgeException("idade maluca");
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }

                // pergunta 6
            lerPerguntas.pergunta();
            try {
                String peso_cru = sc.next();
                String peso_padrao = peso_cru.replace(",",".");
                float peso = Float.parseFloat(peso_padrao);
                if (peso > 60) {
                    throw new InvalidWeigthException("peso invalido");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }

            //pergunta 7
            lerPerguntas.pergunta();
            String raca = sc.next();


                }
        }

