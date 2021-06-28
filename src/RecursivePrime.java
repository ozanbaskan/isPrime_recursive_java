import java.util.Scanner;

public class RecursivePrime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find out if it is prime: ");
        int input = s.nextInt();
        if(isPrime(input,2))
        {
            System.out.println("The number " + input + " is prime.");
        }
        else
        {
            System.out.println("The number " + input + " is NOT prime.");
        }
    }

    static boolean isPrime(int num, int c)
    {
        if (num == 1) return false;
        if (num == 2) return true;
        if (num % c == 0) return false;
        if (c * c > num) return true;

        return isPrime(num,c+1);
    }




}
