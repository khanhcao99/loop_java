package Lai_suat;

import java.util.Scanner;

public class laisuat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi:");
        int money = input.nextInt();
        System.out.println("Nhập vào số tháng gửi: ");
        int month = input.nextInt();
        System.out.println("Nhập vào lãi 1 năm: ");
        double rate = input.nextDouble();
        int totalRate = 0;
        for (int i = 0; i < month; i++) {
            totalRate += money * (rate/100)/12 *month;
        }

        System.out.println("Tổng lãi nhận được là: " + totalRate);
    }
}
