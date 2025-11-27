package JavaDSA_Practice;

public class Running_Sum_Of_1D_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
            runningSum[i] = sum;
        }
        for (int i = 0; i < runningSum.length; i++) {
            System.out.println(runningSum[i]);
        }
    }
}
