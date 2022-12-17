package factorial;

import java.util.Scanner;

public class Factorial1 {

    private static int firstFactorial(int num) {

        if(num <= 1){
            return 1;
        }
        return num * firstFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Given the variable num to be passed, return the value of its factorial. For example: if num = 4, the
                program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and
                the input will always be an integer.
                """);

        System.out.println("Enter a number:");

        System.out.print(firstFactorial(scanner.nextInt()));

        scanner.close();
    }
}
