import java.util.Arrays;

class Solution {
    static void rotateArr(int arr[], int d) {
        int temp[] = new int[arr.length];
        d = d % arr.length;
        for(int j = 0; j < arr.length; j++){
            if(j - d >= 0){
                temp[j - d] = arr[j];
            }
            else{
                temp[arr.length + (j - d)] = arr[j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class RotateTest {
    public static void main(String[] args) {
        System.out.println("=== ROTATE ARRAY TEST ===\n");

        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("Test 1 - Approach 1 (Extra Space):");
        System.out.println("Original: " + Arrays.toString(arr1));
        Solution.rotateArr(arr1, k1);
        System.out.println("After rotate by " + k1 + ": " + Arrays.toString(arr1));
        System.out.println("Expected: [5, 6, 7, 1, 2, 3, 4]\n");

        // Test Case 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Test 2 - Approach 2 (Reverse Method):");
        System.out.println("Original: " + Arrays.toString(arr2));
        Solution.rotate(arr2, k1);
        System.out.println("After rotate by " + k1 + ": " + Arrays.toString(arr2));
        System.out.println("Expected: [5, 6, 7, 1, 2, 3, 4]\n");

        // Test Case 3 - k > array length
        int[] arr3 = {1, 2, 3, 4, 5};
        int k2 = 7;
        System.out.println("Test 3 - k > array length (Reverse Method):");
        System.out.println("Original: " + Arrays.toString(arr3));
        Solution.rotate(arr3, k2);
        System.out.println("After rotate by " + k2 + ": " + Arrays.toString(arr3));
        System.out.println("Expected (rotate by 2): [4, 5, 1, 2, 3]\n");

        // Test Case 4 - Single element
        int[] arr4 = {1};
        int k3 = 5;
        System.out.println("Test 4 - Single element:");
        System.out.println("Original: " + Arrays.toString(arr4));
        Solution.rotate(arr4, k3);
        System.out.println("After rotate by " + k3 + ": " + Arrays.toString(arr4));
        System.out.println("Expected: [1]");
    }
}

