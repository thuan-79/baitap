package baitap;
import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên từ bàn phím
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính tổng, hiệu, tích, thương và phần dư
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = num1 / (double) num2; // Chia số thực
        int remainder = num1 % num2;

        // In kết quả ra màn hình
        System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + sum);
        System.out.println("Hiệu của " + num1 + " và " + num2 + " là: " + difference);
        System.out.println("Tích của " + num1 + " và " + num2 + " là: " + product);
        System.out.println("Thương của " + num1 + " và " + num2 + " là: " + quotient);
        System.out.println("Phần dư của " + num1 + " chia cho " + num2 + " là: " + remainder);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}