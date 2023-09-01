package org.exception1;
import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class IncorrectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        try {
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }
        } catch (InvalidNumberException e) {
            System.err.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Не является числом.");
        }
    }
}