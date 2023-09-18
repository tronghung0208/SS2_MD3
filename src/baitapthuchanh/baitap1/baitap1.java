package baitapthuchanh.baitap1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đầu");
        int number1 = sc.nextInt();
        System.out.println("Nhập số sau");
        int number2 = sc.nextInt();
        int total = 0;
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tổng các số chẵn: "+total);
    }
}
