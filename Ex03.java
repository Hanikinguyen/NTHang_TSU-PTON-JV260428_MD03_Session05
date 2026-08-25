import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String text = sc.nextLine();

        String result = text.replaceAll("[0-9]", "*");

        System.out.println("Chuỗi sau khi thay thế: " + result);

        sc.close();
    }
}