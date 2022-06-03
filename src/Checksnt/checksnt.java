package Check_snt;

import java.util.Scanner;

public class checksnt {
    public static void main(String[] args) {
        Scanner valua = new Scanner(System.in);
        System.out.println("Input number needed check prime: ");
        int number = valua.nextInt();
        if (number < 2) {
            System.out.println(number + " is not prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
