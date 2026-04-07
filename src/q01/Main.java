import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
import java.util.Scanner;

        // Upper part
        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *

    }
}
