package JavaDSA_Practice;

public class Sum_Of_1D_Array {
    public static void main(String[] args) {
        // Example: Sum of elements in a 1D array
        int[] nums = { 5, -2, 10 };
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
