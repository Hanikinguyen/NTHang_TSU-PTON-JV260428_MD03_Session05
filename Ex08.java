import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String text = sc.nextLine();

        // Nếu chuỗi rỗng
        if (text.isEmpty()) {
            System.out.println("");
            return;
        }

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < text.length(); i++) {

            // Nếu ký tự hiện tại giống ký tự tiếp theo
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                // Thêm ký tự và số lần xuất hiện
                result.append(text.charAt(i));
                result.append(count);

                // Reset lại count
                count = 1;
            }
        }

        System.out.println("Chuỗi sau khi nén: " + result);

        sc.close();
    }
}
