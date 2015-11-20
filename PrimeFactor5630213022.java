import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor5630213022 {

    public void calculate(int number) {
        List<Integer> factor = new ArrayList<Integer>();
        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                factor.add(i);
                number /= i;
            }
        }
        if (number > 1) {
            factor.add(number);
        }
        System.out.print("Prime Factor is : " + factor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeFactor primfactor = new PrimeFactor();

        int i = 0;
        while (i < 10) {
            System.out.print("Enter number : ");
            int numbers = sc.nextInt();
            primfactor.calculate(numbers);
            System.out.println("");
        }
        System.out.println("The End");
    }

}
