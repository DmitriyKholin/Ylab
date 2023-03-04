package Guess;

import java.util.Scanner;

public class Guess {
        public static void main(String[] args) {
            int number = (int) (Math.random() * 98 + 2);

            int maxAttempts = 10;
            System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
            Scanner in = new Scanner(System.in);
            int attempt = 1;

            while (maxAttempts > 0) {
                System.out.print("Введи число: ");
                int value = in.nextInt();
                maxAttempts--;

                if (maxAttempts != 0) {
                    if (value == number) {
                        System.out.println("Ты угадал число с " + attempt + " попытки");
                        maxAttempts = 0;
                    } else if (value < number) {
                        System.out.println("Мое число больше! У тебя осталось " + maxAttempts + " попыток");
                    } else if (value > number) {
                        System.out.println("Мое число меньше! У тебя осталось " + maxAttempts + " попыток");
                    }
                    attempt++;
                } else {
                    System.out.println("Ты не угадал");
                }
            }
        }
    }


