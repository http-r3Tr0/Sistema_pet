package service;

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
                String nome = sc.next();
                String sobrenome = sc.next();

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
                String rua = sc.next();
                int numero = sc.nextInt();
                String cidade = sc.next();

                // pergunta 5
                lerPerguntas.pergunta();


                }
        }

