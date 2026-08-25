public class Ex02 {
    public static void main(String[] args) {

        // Chuỗi ban đầu
        StringBuilder text = new StringBuilder("Hello, Java World!");

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + text);

        // Xóa các ký tự từ vị trí 5 đến 9
        text.delete(5, 10);

        // In chuỗi sau khi xóa
        System.out.println("Sau khi xóa: " + text);

        // Thay thế "World" bằng "Universe"
        text.replace(7, 12, "Universe");

        // In chuỗi sau khi thay thế
        System.out.println("Sau khi thay thế: " + text);
    }
}