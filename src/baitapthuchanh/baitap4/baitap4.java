package baitapthuchanh.baitap4;

public class baitap4 {
    public static void main(String[] args) {
        System.out.println("Các 20 số nguyên tố đầu tiên là:");

        int soNguyenToHienTai = 2;
        int soLuongDaTimThay = 0;

        while (soLuongDaTimThay < 20) {
            if (isPrime(soNguyenToHienTai)) {
                System.out.print(soNguyenToHienTai + " ");
                soLuongDaTimThay++;
            }
            soNguyenToHienTai++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}