package baitapthuchanh.baitap6;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1. in ra choice ");
            System.out.println("2. tính diện tích HCN");
            System.out.println("3. thoat");
            System.out.println("xin mời lựa chọn");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println(choice);
                    break;
                case 2:
                    System.out.println("Nhập chiều dài HCN");
                    int height=sc.nextInt();
                    System.out.println("Nhập chiều rộng HCN");
                    int width= sc.nextInt();
                    System.out.println("Diện tích HCN là: "+width*height);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lonhg chọn lại");
                    break;
            }
        }while (choice!=0);
    }
}
