package butte.emily.SumOfTheNumbers;

import java.util.Scanner;

public class SumOfTheNumbers {

    public static void main(String[] args) {
        System.out.println("Pick a number 1 -50.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
            System.out.println("Sum of the numbers = " + sum);
        }
    }

