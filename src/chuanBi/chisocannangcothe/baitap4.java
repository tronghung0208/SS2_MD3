package chuanBi.chisocannangcothe;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg): ");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao(m): ");
        double height = sc.nextDouble();
        double bmi = weight / (Math.pow(height, 2));

        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi<25.0) {
            System.out.println("Normal");
            
        } else if (bmi<30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
