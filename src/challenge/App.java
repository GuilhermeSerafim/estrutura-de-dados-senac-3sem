package challenge;

import java.util.Scanner;

// Control the queue of a blood collection laboratory
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = 1000;
        // System.out.println("Enter the number of people in the queue: ");
        // int nrPeople = in.nextInt();
        // in.nextLine();

        // BloodCollectionQueue peoplesInQueue = new BloodCollectionQueue(nrPeople);
        BloodCollectionQueue peoplesInQueue = new BloodCollectionQueue();
        // Input of people's
        for (int i = 0; i < peoplesInQueue.getLength(); i++) {
            System.out.printf("\nEnter the %dth person's blood type in the queue: ", i + 1);
            String blood = in.nextLine();
            System.out.printf("\nThe %dth person's is preferential? (yes / no) ", i + 1);
            boolean preferential = in.nextLine().trim().toLowerCase().equals("yes") ? true : false;
            System.out.printf("Enter the %dth person's name in the queue? ", i + 1);
            String name = in.nextLine();
            peoplesInQueue.add(new People(id++, blood, preferential, name));
        }
        in.close();

        // List Queue with business rule
        while (true) {
            // if return null break
            People person = peoplesInQueue.dequeue();
            if (person == null) {
                System.out.println("Ninguém na fila, encerrando programa.");
                return;
            }
            System.out.println("Password: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Blood type: " + person.getBloodType());
            System.out.println("Preferential? " + person.isPreferential());
        }
        
    }
}
