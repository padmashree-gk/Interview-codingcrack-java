package patterns;

public class PrintButterfly
{
    public static void main(String[] args)
    {
        int n = 10; // Size of the butterfly (half of the total height)

        // Top half of the butterfly
        for (int i = 1; i <= n; i++) 
        {
            // Print left side of the butterfly
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) 
            {
                System.out.print(" ");
            }
            // Print right side of the butterfly
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

   //      Bottom half of the butterfly
        for (int i = n; i >= 1; i--) 
        {
            // Print left side of the butterfly
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) 
            {
                System.out.print(" ");
            }
            // Print right side of the butterfly
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
