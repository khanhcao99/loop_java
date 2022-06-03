package Interest_rate;

import java.util.Scanner;

public class interestrate {
    public static void main(String[] args) {
        Scanner valua = new Scanner(System.in);
        System.out.println("Tôi cần in ra các số nguyên tố nhỏ hơn: ");
        int number = valua.nextInt();
        if (number<2){
            System.out.println("Không có số nguyển tố nào cả");
        }else {
            for (int i = 2; i < number; i++) {
                boolean check = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println(i);
                }
            }
        }
    }
}
