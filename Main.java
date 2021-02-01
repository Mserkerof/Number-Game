/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberComparator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mserkerof
 */
public class Main {

    public static void main(String args[]) {
            
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter a number from 0 to 100 to compare the computers number!");
        int counter = 0;
        int inputNumber = scanner.nextInt();
        int randomNumber = random.nextInt(101);

        while (inputNumber != randomNumber) {
            if (inputNumber > 0 || inputNumber < 100) {
                if (inputNumber < randomNumber) {
                    System.out.println("Please enter a larger number.");
                    counter++;
                    inputNumber = scanner.nextInt();
                } else {
                    System.out.println("Please enter a smaller number.");
                    counter++;
                    inputNumber = scanner.nextInt();
                }
            } else {
                System.out.println("Please enter a smaller number.");
                counter++;
            }

        }
        if (inputNumber == randomNumber) {
            System.out.println("Perfect! You have won! The correctly number is" + inputNumber
                    + "\nTotal try: " + counter);
        }

    }

}
