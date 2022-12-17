package factorial;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Given the variable num to be passed, return the value of its factorial. For example: if num = 4, the
                program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and
                the input will always be an integer.
                """);

        int num;
        int firstFactorial = 1;

        System.out.println("Enter a number:");
        num = scanner.nextInt();

        if(num <= 1){
            return 1;
        }
       
    }
}
