package challenge;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BloodCollectionQueue queue = new BloodCollectionQueue(16);
        int nextTicket = 1000;

        while (true) {
            printMenu();
            int option = readInt(in, "Choose an option: ");

            switch (option) {
                case 1: {
                    People p = new People(nextTicket++, false);
                    queue.addNormal(p);
                    System.out.println("Normal ticket issued: " + p);
                    break;
                }
                case 2: {
                    People p = new People(nextTicket++, true);
                    queue.addPreferential(p);
                    System.out.println("Preferential ticket issued: " + p);
                    break;
                }
                case 3: {
                    System.out.println("Current queue: " + queue);
                    break;
                }
                case 4: {
                    People next = queue.whoIsNext();
                    if (next == null)
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Next to be called: " + next);
                    break;
                }
                case 5: {
                    People served = queue.callNext();
                    if (served == null)
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Calling: " + served);
                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    in.close();
                    return;
                }
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("==== Blood Collection Laboratory ====");
        System.out.println("1 - Request Ticket (Normal)");
        System.out.println("2 - Request Ticket (Preferential)");
        System.out.println("3 - List all tickets");
        System.out.println("4 - Peek Queue (next to be called)");
        System.out.println("5 - Call element from the queue (remove)");
        System.out.println("0 - Exit");
    }

    private static int readInt(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                in.next(); // discard invalid token
                System.out.println("Enter a valid number.");
            }
        }
    }
}
