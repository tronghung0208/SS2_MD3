package chuanBi.giaiphuongtrinhbacnhat;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhập vào số a");
        a=sc.nextDouble();
        System.out.println("Nhập vào số b");
        b=sc.nextDouble();
        System.out.println("Nhập vào số c");
        c=sc.nextDouble();

        if (a!=0){
            double x=(c-b)/a;
            System.out.println("Phương trình có nghiệm: "+x);
        } else {
            if (b==c){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
