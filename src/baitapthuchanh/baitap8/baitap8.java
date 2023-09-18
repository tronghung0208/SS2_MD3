package baitapthuchanh.baitap8;

import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Nhập a: ");
            double a = sc.nextDouble();
            System.out.println("Nhập b: ");
            double b = sc.nextDouble();
            System.out.println("Nhập c: ");
            double c = sc.nextDouble();
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
                double p = (a + b + c);
                double cv=p/2;
                System.out.println("Chu vi tam giác là: " + p);
                System.out.println("Diện tích tam giác là: " + Math.sqrt(cv * (cv - a) * (cv - b) * (cv - c)));
                break;
            } else {
                System.out.println("Mời nhập lại");
            }
        }

    }
}
