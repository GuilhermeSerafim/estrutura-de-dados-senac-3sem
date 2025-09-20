package challenge;

import java.util.InputMismatchException;
import java.util.Scanner;

// Guilherme Serafim - 3ºNA Senac

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BloodCollectionQueue queue = new BloodCollectionQueue(16);
        int nextTicket = 1000;

        while (true) {
            printMenu();
            int option = readInt(in, "Escolha uma opção: ");

            switch (option) {
                case 1: {
                    People p = new People(nextTicket++, false);
                    queue.addNormal(p);
                    System.out.println("Senha normal emitida: " + p);
                    break;
                }
                case 2: {
                    People p = new People(nextTicket++, true);
                    queue.addPreferential(p);
                    System.out.println("Senha preferencial emitida: " + p);
                    break;
                }
                case 3: {
                    System.out.println("Fila atual: " + queue);
                    break;
                }
                case 4: {
                    People next = queue.whoIsNext();
                    if (next == null)
                        System.out.println("Fila vazia.");
                    else
                        System.out.println("Próximo a ser chamado: " + next);
                    break;
                }
                case 5: {
                    People served = queue.callNext();
                    if (served == null)
                        System.out.println("Fila vazia.");
                    else
                        System.out.println("Chamando: " + served);
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    in.close();
                    return;
                }
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("==== Laboratório de Coleta de Sangue ====");
        System.out.println("1 - Solicitar Senha (Normal)");
        System.out.println("2 - Solicitar Senha (Preferencial)");
        System.out.println("3 - Listar todas as senhas");
        System.out.println("4 - Espiar a Lista (próximo a ser chamado)");
        System.out.println("5 - Chamar elemento da fila (remover)");
        System.out.println("0 - Sair");
    }

    private static int readInt(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                in.next(); // discard invalid token
                System.out.println("Digite um número válido.");
            }
        }
    }
}
