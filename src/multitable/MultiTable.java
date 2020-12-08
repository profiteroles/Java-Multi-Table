package multitable;

import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Please Enter The Number You'd Like Multiply");
        int num = sc.nextInt();
        for (int l = 1; l <= 12; l++) {
            System.out.println(num + " X " + l + " = " + (num * l));
        }
    }
}
/**
 *
 * @author 30023737
 */
