import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    Map<Integer, Integer> numMap = new HashMap<>();
    int numOfIntegers = 5;

    // Prompt the user to enter the integers
        for (int i = 0; i < numOfIntegers; i++) {
            //System.out.print(">");
            int num = in.nextInt();
            // Update the HashMap with the occurrence of the integer
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        // Find the mode (highest occurrence)
        int mode = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            System.out.printf("count: %s",count);
            System.out.printf("num: %s",num);
            if (count > maxCount) {
                mode = num;
                maxCount = count;
                // something is happening
            }
        }
        // Print the mode
        System.out.println(mode);
  }
}
