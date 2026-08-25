import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập n (1 - 1000): ");
        int n = sc.nextInt();

        // Kiểm tra n hợp lệ
        if (n < 1 || n > 1000) {
            System.out.println("n không hợp lệ!");
            return;
        }

        // Tập hợp các ký tự có thể sử dụng
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "abcdefghijklmnopqrstuvwxyz" +
                        "0123456789";

        StringBuilder result = new StringBuilder();

        // Tạo chuỗi ngẫu nhiên
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên: " + result);

        sc.close();
    }
}