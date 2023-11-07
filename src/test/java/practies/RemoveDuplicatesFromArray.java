package practies;

import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        for (int num : array) {
            uniqueElements.add(num);
        }
        
        // Convert the HashSet back to an array
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index] = num;
            index++;
        }
        
        // Printing the array with duplicates removed
        System.out.println(Arrays.toString(result));
    }
}
