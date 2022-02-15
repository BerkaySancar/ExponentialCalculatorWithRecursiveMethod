import java.util.Scanner;

public class ExponentialCalculatorWithRecursiveMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Number: ");
            int n = scan.nextInt();
            System.out.print("Exponent: ");
            int e = scan.nextInt();
            System.out.println("Answer = " + exponential(n, e));
        }
    }

    public static int exponential(int x, int y) {
        if (y == 0)
            return 1;
        else {
            return x * exponential(x, y - 1);
        }
    }
}

