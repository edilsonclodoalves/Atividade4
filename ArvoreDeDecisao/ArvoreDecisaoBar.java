package ArvoreDeDecisao;

import java.util.Scanner;

public class ArvoreDecisaoBar {
    // Declarando o scanner para coletar o input

    public static void main(String[] args) {

        // Declarando variaveis
        Scanner sc = new Scanner(System.in);
        String tipoBebidaInput;
        int tipoBebida = -1;

        while (tipoBebida != 0 && tipoBebida != 1) {
            System.out.printf("Escolha o tipo de bebida:\n 0 - para Bebida Alcóolica \n 1 - para Bebida não Alcóolica");
            System.out.printf("\nDigite (0 ou 1): ");

            tipoBebidaInput = sc.nextLine(); // Lê a entrada como texto

            // Verifica se o texto é vazio
            if (tipoBebidaInput.isEmpty()) {
                System.out.println("Você deve digitar uma opção.");
                continue; // Retorna ao início do loop
            }

            // Tenta converter a entrada de texto para um inteiro
            try {
                tipoBebida = Integer.parseInt(tipoBebidaInput);

                // Verifica se o valor está fora do intervalo esperado
                if (tipoBebida != 0 && tipoBebida != 1) {
                    System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                    tipoBebida = -1; // Reseta a variável para garantir a repetição do loop se necessário
                }
            } catch (NumberFormatException e) {
                // A entrada não é um inteiro válido
                System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
            }
        }
        // Nó Raiz: Tipo de Bebida
        // int tipoBebida = 1; // 0 = Alcoólica, 1 = Não Alcoólica

        // Nível 1: Bebida Alcoólica
        if (tipoBebida == 0) {

            String preferenciaSaborInput;
            int preferenciaSabor = -1; // 0 = Amargo, 1 = Doce

            while (preferenciaSabor != 0 && preferenciaSabor != 1) {
                System.out.printf("Escolha a preferência de sabor:\n 0 - para Amargo \n 1 - para Doce");
                System.out.printf("\nDigite (0 ou 1): ");

                preferenciaSaborInput = sc.nextLine(); // Lê a entrada como texto

                // Verifica se o texto é vazio
                if (preferenciaSaborInput.isEmpty()) {
                    System.out.println("Você deve digitar uma opção.");
                    continue; // Retorna ao início do loop
                }

                // Tenta converter a entrada de texto para um inteiro
                try {
                    preferenciaSabor = Integer.parseInt(preferenciaSaborInput);

                    // Verifica se o valor está fora do intervalo esperado
                    if (preferenciaSabor != 0 && preferenciaSabor != 1) {
                        System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                        preferenciaSabor = -1; // Reseta a variável para garantir a repetição do loop se necessário
                    }
                } catch (NumberFormatException e) {
                    // A entrada não é um inteiro válido
                    System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                }
            }

            // Nível 2: Preferência por Sabor Amargo
            if (preferenciaSabor == 0) {

                String tipoBebidaAmargaInput;
                int tipoBebidaAmarga = -1; // 0 = Cerveja, 1 = Licor

                while (tipoBebidaAmarga != 0 && tipoBebidaAmarga != 1) {
                    System.out.printf("Escolha o tipo de bebida:\n 0 - para Cerveja \n 1 - para Licor");
                    System.out.printf("\nDigite (0 ou 1): ");

                    tipoBebidaAmargaInput = sc.nextLine(); // Lê a entrada como texto

                    // Verifica se o texto é vazio
                    if (tipoBebidaAmargaInput.isEmpty()) {
                        System.out.println("Você deve digitar uma opção.");
                        continue; // Retorna ao início do loop
                    }

                    // Tenta converter a entrada de texto para um inteiro
                    try {
                        tipoBebidaAmarga = Integer.parseInt(tipoBebidaAmargaInput);

                        // Verifica se o valor está fora do intervalo esperado
                        if (tipoBebidaAmarga != 0 && tipoBebidaAmarga != 1) {
                            System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                            tipoBebidaAmarga = -1; // Reseta a variável para garantir a repetição do loop se necessário
                        }
                    } catch (NumberFormatException e) {
                        // A entrada não é um inteiro válido
                        System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                    }

                    // Nível 3: Escolha de Cerveja
                    if (tipoBebidaAmarga == 0) {
                        System.out.println(
                                "Cerveja recomendada. Opte por estilos como IPA, Stout ou Porter para um sabor mais intenso.");
                        return;
                    }

                    // Nível 4: Escolha de Licor
                    if (tipoBebidaAmarga == 1) {
                        System.out.println(
                                "Licor recomendado. Opte por sabores como Campari, Fernet ou Jägermeister para um sabor digestivo.");
                        return;
                    }

                }

            }

            // Nível 5: Preferência por Sabor Doce
            if (preferenciaSabor == 1) {
                String tipoBebidaDoceInput;
                int tipoBebidaDoce = -1; // 0 = Caipirinha, 1 = Mojito

                while (tipoBebidaDoce != 0 && tipoBebidaDoce != 1) {
                    System.out.printf("Escolha o tipo de bebida:\n 0 - para Caipirinha \n 1 - para Mojito");
                    System.out.printf("\nDigite (0 ou 1): ");

                    tipoBebidaDoceInput = sc.nextLine(); // Lê a entrada como texto

                    // Verifica se o texto é vazio
                    if (tipoBebidaDoceInput.isEmpty()) {
                        System.out.println("Você deve digitar uma opção.");
                        continue; // Retorna ao início do loop
                    }

                    // Tenta converter a entrada de texto para um inteiro
                    try {
                        tipoBebidaDoce = Integer.parseInt(tipoBebidaDoceInput);

                        // Verifica se o valor está fora do intervalo esperado
                        if (tipoBebidaDoce != 0 && tipoBebidaDoce != 1) {
                            System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                            tipoBebidaDoce = -1; // Reseta a variável para garantir a repetição do loop se necessário
                        }
                    } catch (NumberFormatException e) {
                        // A entrada não é um inteiro válido
                        System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                    }

                    // Nível 6: Escolha de Caipirinha
                    if (tipoBebidaDoce == 0) {
                        System.out.println(
                                "Caipirinha recomendada. Opte por sabores clássicos como limão, vodka e cachaça.");
                        return;
                    }

                    // Nível 7: Escolha de Mojito
                    if (tipoBebidaDoce == 1) {
                        System.out.println(
                                "Mojito recomendado. Refrescante e saboroso, com rum, hortelã, limão e açúcar.");
                        return;
                    }
                }
            }
        }

        // Nível 8: Bebida Não Alcoólica
        if (tipoBebida == 1) {

            String preferenciaTemperaturaInput;
            int preferenciaTemperatura = -1; // 0 = Fria, 1 = Quente

            while (preferenciaTemperatura != 0 && preferenciaTemperatura != 1) {
                System.out.printf("Escolha a preferencia da temperatura:\n 0 - para Fria \n 1 - para Quente");
                System.out.printf("\nDigite (0 ou 1): ");

                preferenciaTemperaturaInput = sc.nextLine(); // Lê a entrada como texto

                // Verifica se o texto é vazio
                if (preferenciaTemperaturaInput.isEmpty()) {
                    System.out.println("Você deve digitar uma opção.");
                    continue; // Retorna ao início do loop
                }

                // Tenta converter a entrada de texto para um inteiro
                try {
                    preferenciaTemperatura = Integer.parseInt(preferenciaTemperaturaInput);

                    // Verifica se o valor está fora do intervalo esperado
                    if (preferenciaTemperatura != 0 && preferenciaTemperatura != 1) {
                        System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                        preferenciaTemperatura = -1; // Reseta a variável para garantir a repetição do loop se
                                                     // necessário
                    }
                } catch (NumberFormatException e) {
                    // A entrada não é um inteiro válido
                    System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                }

            }

            // Nível 9: Preferência por Bebida Fria
            if (preferenciaTemperatura == 0) {

                String tipoBebidaFriaInput;
                int tipoBebidaFria = -1; // 0 = Suco, 1 = Refrigerante

                while (tipoBebidaFria != 0 && tipoBebidaFria != 1) {
                    System.out.printf("Escolha o tipo de bebida:\n 0 - para Suco \n 1 - para Refrigerante");
                    System.out.printf("\nDigite (0 ou 1): ");

                    tipoBebidaFriaInput = sc.nextLine(); // Lê a entrada como texto

                    // Verifica se o texto é vazio
                    if (tipoBebidaFriaInput.isEmpty()) {
                        System.out.println("Você deve digitar uma opção.");
                        continue; // Retorna ao início do loop
                    }

                    // Tenta converter a entrada de texto para um inteiro
                    try {
                        tipoBebidaFria = Integer.parseInt(tipoBebidaFriaInput);

                        // Verifica se o valor está fora do intervalo esperado
                        if (tipoBebidaFria != 0 && tipoBebidaFria != 1) {
                            System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                            tipoBebidaFria = -1; // Reseta a variável para garantir a repetição do loop se necessário
                        }
                    } catch (NumberFormatException e) {
                        // A entrada não é um inteiro válido
                        System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                    }

                    // Nível 10: Escolha de Suco
                    if (tipoBebidaFria == 0) {
                        int tipoFruta = 1; // 0 = Laranja, 1 = Abacaxi

                        // Nível 11: Suco de Laranja
                        if (tipoFruta == 0) {
                            System.out.println("Suco de laranja recomendado, rico em vitamina C e refrescante.");
                            return;
                        }

                        // Nível 12: Suco de Abacaxi
                        if (tipoFruta == 1) {
                            System.out.println("Suco de abacaxi recomendado, com sabor doce e tropical.");
                            return;
                        }
                    }
                }
                // Nível 13: Escolha de Refrigerante
                if (tipoBebidaFria == 1) {
                    System.out.println(
                            "Refrigerante recomendado. Escolha entre sabores tradicionais como cola, guaraná ou laranja.");
                    return;
                }
            }
            
            // Nível 14: Preferência por Bebida Quente
            if (preferenciaTemperatura == 1) {

                String tipoBebidaQuenteInput;
                int tipoBebidaQuente = -1; // 0 = Café, 1 = Chá

                while (tipoBebidaQuente != 0 && tipoBebidaQuente != 1) {
                    System.out.printf("Escolha o tipo de bebida:\n 0 - para Café \n 1 - para Chá");
                    System.out.printf("\nDigite (0 ou 1): ");

                    tipoBebidaQuenteInput = sc.nextLine(); // Lê a entrada como texto

                    // Verifica se o texto é vazio
                    if (tipoBebidaQuenteInput.isEmpty()) {
                        System.out.println("Você deve digitar uma opção.");
                        continue; // Retorna ao início do loop
                    }

                    // Tenta converter a entrada de texto para um inteiro
                    try {
                        tipoBebidaQuente = Integer.parseInt(tipoBebidaQuenteInput);

                        // Verifica se o valor está fora do intervalo esperado
                        if (tipoBebidaQuente != 0 && tipoBebidaQuente != 1) {
                            System.out.println("\nOpção inválida, digite somente 0 ou 1.");
                            tipoBebidaQuente = -1; // Reseta a variável para garantir a repetição do loop se necessário
                        }
                    } catch (NumberFormatException e) {
                        // A entrada não é um inteiro válido
                        System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
                    }

                    // Nível 15: Escolha de Café
                    if (tipoBebidaQuente == 0) {
                        System.out.println(
                                "Café recomendado. Opte por um espresso para um sabor intenso ou um cappuccino para uma bebida cremosa.");
                        return;
                    }

                    // Nível 16: Escolha de Chá
                    if (tipoBebidaQuente == 1) {
                        System.out.println(
                                "Chá recomendado. Escolha entre sabores como verde, preto, camomila ou hortelã para um efeito relaxante.");
                        return;
                    }

                }
            }
        }
        sc.close();
        
    }
    

}
