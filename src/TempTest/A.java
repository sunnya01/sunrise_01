package TempTest;

/**
 * @author sunchaowei
 * @create 2025-2025/12/17-09:11
 */
public class A {

    public static void main(String[] args) {

//案例 1
        System.out.println((123456725f - 3f > 123456724f)); // true
        System.out.println((123456728f - 3f > 123456720f)); // true

//案例 2
        System.out.println((123456724f + 4f < 123456725f)); // true
        System.out.println((123456720f + 4f < 123456728f)); // true

//案例 3
        int n = 123456789;
        float s = 0f;
        for (int i = 0; i < n; i++) {
            s += 1f;
        }
        System.out.println(s); // 16777216
    }
}
