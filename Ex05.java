public class Ex05 {
    public static void main(String[] args) {

        int n = 1_000_000;

        // =========================
        // 1. String
        // =========================
        long startString = System.currentTimeMillis();

        String text = "Hello";

        for (int i = 0; i < n; i++) {
            text = text + " World";
        }

        long endString = System.currentTimeMillis();

        System.out.println("String: " + (endString - startString) + " ms");


        // =========================
        // 2. StringBuilder
        // =========================
        long startBuilder = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder("Hello");

        for (int i = 0; i < n; i++) {
            builder.append(" World");
        }

        long endBuilder = System.currentTimeMillis();

        System.out.println("StringBuilder: " + (endBuilder - startBuilder) + " ms");


        // =========================
        // 3. StringBuffer
        // =========================
        long startBuffer = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer("Hello");

        for (int i = 0; i < n; i++) {
            buffer.append(" World");
        }

        long endBuffer = System.currentTimeMillis();

        System.out.println("StringBuffer: " + (endBuffer - startBuffer) + " ms");


        // =========================
        // Nhận xét
        // =========================
        System.out.println("\nNhận xét:");
        System.out.println("- String có hiệu suất thấp khi nối chuỗi nhiều lần.");
        System.out.println("- StringBuilder thường có hiệu suất tốt nhất khi nối chuỗi.");
        System.out.println("- StringBuffer chậm hơn StringBuilder do có cơ chế đồng bộ hóa.");
    }
}
