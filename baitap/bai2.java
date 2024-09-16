package baitap;

public class bai2 {
    public static void main(String[] args) {
        // Khai báo các biến
        String name = "Võ Thị Mỹ Thuận"; // Tên, dùng kiểu String
        int age = 19;                // Tuổi, dùng kiểu int
        double height = 1.62;        // Chiều cao, dùng kiểu double
        char gender = 'G';           // Giới tính, dùng kiểu char
        boolean likesProgramming = true; // Sở thích lập trình, dùng kiểu boolean

        // In ra các giá trị đã lưu
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " mét");
        System.out.println("Giới tính: " + gender);
        System.out.println("Có thích lập trình không? " + (likesProgramming ? "Có" : "Không"));
    }
}