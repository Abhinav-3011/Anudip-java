import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        
        System.out.print("Enter the bit position to check (starting from 0): ");
        int n = scanner.nextInt();

        
        String result = ((num & (1 << n)) != 0) ? "1" : "0";

        
        System.out.println("The " + n + "th bit of the number " + num + " is " + result);
    }
}
