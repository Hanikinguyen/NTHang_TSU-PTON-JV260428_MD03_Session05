import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập văn bản: ");
        String text = sc.nextLine();

        // Kiểm tra chuỗi rỗng
        if (text.trim().isEmpty()) {
            System.out.println("Không có văn bản để xử lý.");
            return;
        }

        // 1. Xóa ký tự đặc biệt
        text = text.replaceAll("[^a-zA-Z0-9\\s]", " ");

        // 2. Chuyển toàn bộ thành chữ thường
        text = text.toLowerCase();

        // 3. Xóa khoảng trắng dư thừa
        text = text.trim().replaceAll("\\s+", " ");

        // 4. Trích xuất các số
        ArrayList<String> numbers = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numbers.add(matcher.group());
        }

        // 5. In kết quả
        System.out.println("Văn bản sau khi chuẩn hóa: " + text);
        System.out.println("Các số trong văn bản: " + numbers);

        sc.close();
    }
}
