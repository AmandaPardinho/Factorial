package factorial;

public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(""" 
                Calculate the factorial value of the numbers 0 to 10 and then print the result.""");


        int i = 0;
        int factorial = 0;

        while(i >= 0 && i <= 10){
            if(i == 0 || i == 1){
                factorial = 1;
                System.out.println(factorial);
            }else{
                factorial *= i;
                System.out.println(factorial);
            }
            i++;
        }
    }
}
