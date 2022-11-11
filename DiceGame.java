package proiect;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        boolean userChoice = true;
        while (userChoice) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Câte zaruri vrei să arunci?");
            Random random = new Random();
            int randomDice = 0;
            int numberOfDices = sc.nextInt();
            while (numberOfDices != 0) {
                randomDice = random.nextInt(8) + 7;

                System.out.println("Zarul aruncat este: " + randomDice);
                numberOfDices = numberOfDices - 1;
            }

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Vrei sa arunci din nou?y/n");
            String question = sc1.nextLine();
            if (question.toLowerCase().equals("y")) {
                userChoice = true;
            } else {
                userChoice = false;
            }
        }
    }
}
