package chuanBi.tinhsongaytrongthang;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào dữ liệu (dạng xx/yyyy)");
        String inputData = sc.nextLine();
        String[] parts = inputData.split("/");
        String thangStr = parts[0];
        String namStr = parts[1];
        int thangInt = Integer.parseInt(thangStr);
        int namInt = Integer.parseInt(namStr);


        switch (thangInt) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(thangInt + "/" + namInt + ": có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(thangInt + "/" + namInt + ": có 30 ngày");
                break;
            case 2:
                if ((namInt % 4 == 0 && namInt % 100 != 0) || (namInt % 400 == 0)) {
                    System.out.println(thangInt + "/" + namInt + ": có 29 ngày");
                } else {
                    System.out.println(thangInt + "/" + namInt + ": có 28 ngày");
                }
                break;
            default:
                System.out.println("bạn nhập chưa đúng");
                break;
        }




    }
}
