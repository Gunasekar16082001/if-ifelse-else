
import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter Your Number: ");
        Scanner index = new Scanner(System.in);
        i = index.nextInt();
        if (i % 2 == 0)

            System.out.println("even");
        else
        	System.out.println("odd");
}
}