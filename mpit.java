import java.util.Scanner;

public class mpit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total belanja dan uang yang diberikan
        System.out.print("Total belanja: ");
        int totalBelanja = input.nextInt();
        System.out.print("Uang yang diberikan: ");
        int uangDiberikan = input.nextInt();

        // Hitung kembalian
        int kembalian = uangDiberikan - totalBelanja;

        // Hitung jumlah pecahan uang
        int pecahan50rb = kembalian / 50000;
        kembalian %= 50000;

        int pecahan20rb = kembalian / 20000;
        kembalian %= 20000;

        int pecahan10rb = kembalian / 10000;
        kembalian %= 10000;

        int pecahan5rb = kembalian / 5000;
        kembalian %= 5000;

        int pecahan2rb = kembalian / 2000;
        kembalian %= 2000;

        int pecahan1rb = kembalian / 1000;
        kembalian %= 1000;

        int pecahan500an = kembalian / 500;

        // Tampilkan hasil kembalian
        System.out.println("Kembalian:");
        System.out.println("50 ribuan: " + pecahan50rb + " lembar");
        System.out.println("20 ribuan: " + pecahan20rb + " lembar");
        System.out.println("10 ribuan: " + pecahan10rb + " lembar");
        System.out.println("5 ribuan: " + pecahan5rb + " lembar");
        System.out.println("2 ribuan: " + pecahan2rb + " lembar");
        System.out.println("1 ribuan: " + pecahan1rb + " lembar");
        System.out.println("500an: " + pecahan500an + " lembar");

        input.close();
    }
}