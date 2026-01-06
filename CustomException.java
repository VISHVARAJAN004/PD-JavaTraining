import java.util.*;
class OddException extends Exception {
    public String toString() {
        return "Odd numbers not allowed";
    }
}
public class CustomException{
    static int number(int n) throws OddException {
        if (n % 2 == 1)
            throw new OddException();
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = sc.nextInt();
            int result = number(num);
            System.out.println("Output: " + result);
        }
        catch (OddException e) {
            System.out.println(e);
        }
    }
}
