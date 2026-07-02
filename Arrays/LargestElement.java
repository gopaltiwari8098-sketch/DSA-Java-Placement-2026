/*
Problem: Largest Element in an Array

Approach:
Traverse the array once and keep updating the maximum element.

Time Complexity: O(n)

Space Complexity: O(1)
*/

public class LargestElement {

    public static int largestElement(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0};

        System.out.println(largestElement(arr));

    }
}