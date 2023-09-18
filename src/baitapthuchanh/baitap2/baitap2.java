package baitapthuchanh.baitap2;

public class baitap2 {
    public static void main(String[] args) {

        System.out.println("in ra HCN rỗng-------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("in ra HCN-------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println(" in ra tam giác-------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" in ra tam giác -------------------------------");
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" in ra tam giác cân-------------------------------");
        for (int i = 0; i <5; i++) {
            for (int j = 0; j<i+5; j++) {
                if (j<5-i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
