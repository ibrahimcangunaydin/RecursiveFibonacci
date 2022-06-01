import java.util.Scanner;

public class Main {

    static int Rf(int n) {

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int result = Rf(n - 1) + Rf(n - 2);
        return result;
    }

    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(Rf(i));
        }

    }
}
