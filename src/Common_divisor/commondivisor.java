package Common_divisor;

import java.util.Scanner;

public class commondivisor {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = value.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = value.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung nào lớn nhất");
        } else {
            while (a != b){
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}
