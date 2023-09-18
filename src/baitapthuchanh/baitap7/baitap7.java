package baitapthuchanh.baitap7;

import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Tính chu vi và diện tích HCN");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình tròn");
            System.out.println("4.Thoát");
            System.out.println("Lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài (m): ");
                    double height = sc.nextDouble();
                    System.out.println("Nhập chiều rộng (m): ");
                    double width = sc.nextDouble();

                    System.out.println("Chu vi HCN: " + (height + width) * 2+"m");
                    System.out.println("Diện tích: " + (height * width)+"m2");
                    break;

                case 2:
                    System.out.println("Nhập a: ");
                    double a=sc.nextDouble();
                    System.out.println("Nhập b: ");
                    double b=sc.nextDouble();
                    System.out.println("Nhập c: ");
                    double c=sc.nextDouble();
                    if (a+b>c&&b+c>a&&a+c>b){
                        double p=a+b+c;
                        System.out.println("Chu vi tam giác là: "+p);
                        System.out.println("Diện tích tam giác là: "+Math.sqrt((p*(p-a)*(p-b)*(p-c))/2));
                    }else {
                        System.out.println("nhập số không hợp lệ, xin nhập lại");
                    }
                    break;
                case 3:
                    System.out.println("Nhập R: ");
                    double r= sc.nextDouble();
                    System.out.println("Chu vi hình tròn: "+2*Math.PI*r);
                    System.out.println("Diện tích hình tròn: "+2*Math.PI*r);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);


    }
}
