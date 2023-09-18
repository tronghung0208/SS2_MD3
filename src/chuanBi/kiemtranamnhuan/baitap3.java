package chuanBi.kiemtranamnhuan;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int yearInt=sc.nextInt();


        if ((yearInt%4==0&&yearInt%100!=0)||yearInt%400==0){
            System.out.println(yearInt +": là năm nhuận");
        }else {
            System.out.println(yearInt +": không phải là năm nhuận");
        }

    }
}
