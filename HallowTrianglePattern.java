package patterns;

public class HallowTrianglePattern {
    public static void main(String[] args) {
        int n = 10; // Height of the triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star for the first and last positions in each row
                // Also, print star for the base of the triangle
                if (i == 1 || j == 1 || j==n ||i==n || j==i ) {
                    System.out.print((char)(i+64)+ " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
