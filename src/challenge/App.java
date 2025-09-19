package challenge;

import java.util.Scanner;

// Control the queue of a blood collection laboratory
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = 1000;
        System.out.println("Enter the number of people in the queue: ");
        int nrPeople = in.nextInt();
        // Consuming 'enter'
        in.nextLine();
        CustomQueue<People> peoplesInQueue = new CustomQueue<People>(nrPeople);

        // Input of people's
        for (int i = 0; i < peoplesInQueue.getLength(); i++) {
            System.out.printf("\nEnter the %dth person's blood type in the queue: ", i + 1);
            String blood = in.nextLine();
            System.out.printf("\n The %dth person's is preferencial? (yes / no)", i + 1);
            boolean preferencial = in.nextLine().trim().toLowerCase().equals("yes") ? true : false;
            peoplesInQueue.add(new People(id++, blood, preferencial));
        }

        // Output of people's
    }
}
