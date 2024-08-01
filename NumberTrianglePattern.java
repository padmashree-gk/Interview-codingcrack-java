package patterns;

public class NumberTrianglePattern {
	public static void main(String[] args) {
        int rows = 4; // Number of rows
        char startChar = 'A'; // Starting number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(startChar + " ");
                startChar++; // Increment the number
            }
            System.out.println(); // Move to the next line
        }
    }

}
