import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập URL: ");
        String url = sc.nextLine().trim();

        // Regex kiểm tra và chia URL thành 3 phần:
        // 1. Protocol
        // 2. Domain
        // 3. Path
        String regex = "^(https?)://([^/]+)(/.*)?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.matches()) {
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3);

            System.out.println("URL hợp lệ");
            System.out.println("Protocol: " + protocol);
            System.out.println("Domain: " + domain);

            if (path != null) {
                System.out.println("Path: " + path);
            } else {
                System.out.println("Path: Không có");
            }

        } else {
            System.out.println("URL không hợp lệ");
        }

        sc.close();
    }
}
