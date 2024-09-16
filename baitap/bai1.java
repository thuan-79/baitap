package baitap;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        
        // Hiển thị thông báo yêu cầu người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        
        // Đọc tên người dùng từ bàn phím
        String name = scanner.nextLine();
        
        // Hiển thị lời chào với tên người dùng
        System.out.println("Hello " + name);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}