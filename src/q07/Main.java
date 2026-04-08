import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int totalSwaps = 0;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    totalSwaps++;
                    swapped = true;
                }
            }
            
            
            if (!swapped) {
                break;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? " " : ""));
        }
        System.out.println();
    
        System.out.println("Swaps: " + totalSwaps);
    }
}

        // TODO: Read n integers into an array
        //       Implement BUBBLE SORT manually (no Arrays.sort)
        //       Print sorted array ascending, space-separated
        //       Then print: "Swaps: X" where X = total number of swaps performed
        //
        // Input:
        // 5
        // 64 34 25 12 22
        //
        // Output:
        // 12 22 25 34 64
        // Swaps: 7

    
