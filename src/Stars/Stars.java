package Stars;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        System.out.println("Введите n m c (например 2 3 $ через пробел)");
        try (var in = new Scanner(System.in)) {
            var n = in.nextInt();
            var m = in.nextInt();
            var c = in.next();
            System.out.println((c.repeat(m)+System.lineSeparator()).repeat(n));
        }
    }
}
