import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi văn bản: ");
        String text = sc.nextLine();

        System.out.print("Nhập từ cần tìm: ");
        String word = sc.nextLine();

        int position = text.indexOf(word);

        if (position != -1) {
            System.out.println("Tìm thấy từ \"" + word + "\" tại vị trí: " + position);
        } else {
            System.out.println("Không tìm thấy từ \"" + word + "\" trong chuỗi.");
        }

        sc.close();
    }
}