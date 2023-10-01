package practice.oop;

import java.util.Scanner;

public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bebek (1. Mallard Duck, 2. Rubber Duck, 3. Decoy Duck, 4. Model Duck, 5. Keluar): ");
        int choice = scanner.nextInt();

        Duck duck = null;

        if (choice == 1) {
            duck = new MallardDuck();
        } else if (choice == 2) {
            // FlyBehavior cantFly = () -> System.out.println("I can't fly");
            // QuackBehavior squeak = () -> System.out.println("Squeak");
            duck = new RubberDuck();
        } else if (choice == 3) {
            duck = new DecoyDuck();
        } else if (choice == 4) {
            duck = new ModelDuck();
        } else if (choice == 5) {
            System.out.println("Keluar dari simulasi.");
            System.exit(0);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

            duck.perfomQuack();
            duck.perfomFly();
    }
}
