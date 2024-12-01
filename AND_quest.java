import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Scanner for reading input
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read N and K for each test case
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            // Read the array elements
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Try to find a non-empty subset with AND equal to K
            boolean found = false;
            
            // Check subsets by iterating through elements and performing AND
            // We need to find at least one subset where AND of elements equals K
            for (int i = 0; i < N; i++) {
                if ((arr[i] & K) == K) { // If arr[i] can contribute to K (AND condition)
                    List<Integer> indices = new ArrayList<>();
                    int andResult = arr[i];
                    indices.add(i + 1);  // Store 1-based index
                    
                    // Try to find more elements that help us get K
                    for (int j = i + 1; j < N; j++) {
                        if ((arr[j] & K) == K) {
                            int tempResult = andResult & arr[j];
                            if (tempResult >= K) {
                                andResult = tempResult;
                                indices.add(j + 1);  // Store 1-based index
                            }
                        }
                    }
                    
                    // If we found a subset where AND == K, output result
                    if (andResult == K) {
                        found = true;
                        System.out.println("YES");
                        System.out.println(indices.size());
                        for (int index : indices) {
                            System.out.print(index + " ");
                        }
                        System.out.println();
                        break;
                    }
                }
            }
            
            // If no valid subset is found, print NO
            if (!found) {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
