package org.exception2;
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class ValueForDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            double dividend = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            double result = dividend / divisor;
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Ошибка: Введите действительное число.");
        } finally {
            scanner.close();
        }
    }
}
