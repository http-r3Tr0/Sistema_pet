package service;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidWeigthException;
import Exceptions.NullSobrenomeException;
import domain.SexoPet;
import domain.TipoPet;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                LerNome lerNome = new LerNome();
                LerSobre lerSobre = new LerSobre();
                String nome = lerNome.lerNome();
               String sobre = lerSobre.lerSobre();


                //pergunta 2 enum
                TipoPet tipoPet = null;
                lerPerguntas.pergunta();
              LerTipoPet lerTipoPet = new LerTipoPet();
              TipoPet tipo_Pet = lerTipoPet.LerTipo();

               //pergunta 3 enum
                   SexoPet sexoPet = null;
                   LerSexoPet lerSexoPet = new LerSexoPet();
                   lerPerguntas.pergunta();
                 sexoPet= lerSexoPet.lerSexo();

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
            Integer idade_numero;

            if (idade.isBlank()) {
                idade = naoinformado;
                idade_numero = 0;
            } else {
                idade_numero = Integer.parseInt(idade);
            }
            try {
                if (idade_numero >= 20) {
                    throw new InvalidAgeException("idade maluca");
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("passou string como número");
            }
            System.out.println(idade);
            System.out.println(idade_numero);


            // pergunta 6
            lerPerguntas.pergunta();
            String peso_cru = sc.nextLine();
            String peso_padrao;
            float peso;
            if (peso_cru.isBlank()){
                peso_cru = naoinformado;
                peso = 0;
                peso_padrao = naoinformado;
            } else {
                peso_padrao = peso_cru.replace(",",".");
                peso = Float.parseFloat(peso_padrao);
                System.out.println(peso_padrao);
            }
            try {
                if (peso > 60) {
                    throw new InvalidWeigthException("peso invalido");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
            System.out.println(peso);
            System.out.println(peso_cru);
            System.out.println(peso_padrao);

            //pergunta 7
            lerPerguntas.pergunta();
            String raca = sc.nextLine().replaceAll("[0-9.,?!@#$%¨&*\\-+=]", "");

            if (raca.isEmpty()){
                raca = naoinformado;
            }
            System.out.println(raca);

            //area do registro
            System.out.println("============== Confirme as informações ==============");


            System.out.println(tipoPet);

            System.out.println(sexoPet);

            System.out.println(rua);
            System.out.println(numero);
            System.out.println(cidade);

            System.out.println(idade_numero);
            System.out.println(idade);

            System.out.println(peso_padrao);

            System.out.println(raca);



            //area do arquivo
            LocalDateTime horario_cadastro = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'hhmm");
            String formatado = horario_cadastro.format(formatter);
            System.out.println(formatado);



        }
        }

