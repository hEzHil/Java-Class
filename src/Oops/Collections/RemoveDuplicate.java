package Oops.Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

                if (arr == null || arr.size() == 0) {
                    System.out.println(0);;
                }

                int n = arr.size();
                int i = 0; // Pointer for the position of unique elements

                for (int j = 1; j < n; j++) {
                    // Check if the current element is different from the last unique element
                    if (!arr.get(j).equals(arr.get(i))) {
                        i++;
                        arr.set(i, arr.get(j)); // Update the position of unique element
                    }
                }

                // Return the size of the modified array with distinct elements
        System.out.println(arr.get(i));
            }
        }



