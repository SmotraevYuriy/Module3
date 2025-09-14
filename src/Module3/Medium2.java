package Module3;

import java.util.Scanner;

public class Medium2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение а:");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b:");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c:");
        double c = scanner.nextDouble();
        double D = (b * b) - (4 * a * c);
        System.out.println("Дискриминант равен " + D);
    }
}
