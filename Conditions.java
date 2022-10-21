import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid response3");
        }
        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaaste");
        // } else if (button == 3) {
        // System.out.println("Bonjoour");
        // } else {
        // System.out.println("Invalid Button");
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("a is lesser");
        // }

        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }
    }
}
