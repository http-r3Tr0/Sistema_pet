package service;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidWeigthException;
import Exceptions.NullSobrenomeException;
import domain.SexoPet;
import domain.TipoPet;
import jdk.swing.interop.SwingInterOpUtils;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPet {
        public void cadastrarPet() {
            final String naoinformado = "NÃO INFORMADO";
                Scanner sc = new Scanner(System.in);

                //carregar as perguntas e inicializar a lista
                LerPerguntas lerPerguntas = new LerPerguntas();
                lerPerguntas.carregarPerguntas();

                //pergunta 1
                lerPerguntas.pergunta();
            String nome = sc.next().replaceAll("[0-9.,?!@#$%¨&*\\-+=]","");
            String sobrenome = sc.nextLine().replace("[0-9.,?!@#$%¨&*\\-+=]","");
                try {
                    if (sobrenome.isEmpty() || sobrenome.isBlank()) {
                        throw new NullSobrenomeException("Sem sobrenome");
                    }
                } catch (NullPointerException e) {
                    throw new RuntimeException();
                }
            if (nome.isEmpty()) {
                nome = naoinformado;
            }

            System.out.println(nome);
            System.out.println(sobrenome);
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
            System.out.println(tE);

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
            System.out.println(toEnum);
                // pergunta 4

                lerPerguntas.pergunta();
                sc.nextLine();
                String endereco = sc.nextLine();
               Scanner scanner = new Scanner(endereco);
               scanner.useDelimiter(",");

               String rua = scanner.next().trim();
               String numero = scanner.next().trim();
               String cidade = scanner.next().trim();

            if (numero.isBlank()) {
                numero = naoinformado;
            }

            System.out.println(rua);
            System.out.println(numero);
            System.out.println(cidade);

                // pergunta 5
                lerPerguntas.pergunta();
                String idade = sc.nextLine();
            try {
                Integer idade_numero = Integer.parseInt(idade);
                if (idade.isBlank() || idade.isEmpty()) {
                    idade = naoinformado;
                    idade_numero = 0;
                }
                    if (idade_numero >= 20) {
                        throw new InvalidAgeException("idade maluca");
                    }

                    System.out.println(idade_numero);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("passou string como número");
                }


            // pergunta 6
            lerPerguntas.pergunta();
                String peso_cru = sc.next();
                String peso_padrao = peso_cru.replace(",",".");
            System.out.println(peso_padrao);
                float peso = Float.parseFloat(peso_padrao);
            try {
                if (peso > 60) {
                    throw new InvalidWeigthException("peso invalido");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
            //pergunta 7
            lerPerguntas.pergunta();
            String raca = sc.next().replaceAll("[0-9.,?!@#$%¨&*\\-+=]", "");

            if (raca.isEmpty()){
                raca = naoinformado;
            }
            System.out.println(raca);

            //area do arquivo
            LocalDateTime horario_cadastro = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'hhmm");
            String formatado = horario_cadastro.format(formatter);
            System.out.println(formatado);



        }
        }

