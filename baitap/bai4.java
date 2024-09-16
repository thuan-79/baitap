package baitap;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gửi, lãi suất hàng năm và số tháng gửi
        System.out.print("Nhập số tiền gửi (VNĐ): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Nhập lãi suất hàng năm (%): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Nhập số tháng gửi: ");
        int months = scanner.nextInt();

        // Tính lãi suất hàng tháng
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Tính số tiền lãi
        double interest = principal * monthlyInterestRate * months;

        // Tính số tiền gốc cuối kỳ
        double finalAmount = principal + interest;

        // In kết quả ra màn hình
        System.out.println("Số tiền lãi sau " + months + " tháng là: " + String.format("%.2f", interest) + " VNĐ");
        System.out.println("Số tiền gốc cuối kỳ là: " + String.format("%.2f", finalAmount) + " VNĐ");

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
