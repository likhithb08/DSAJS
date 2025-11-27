package JavaDSA_Practice;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5, }, { 7, 3 }, { 3, 5 } };
        int richestCustomer = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth = accounts[i][j] + customerWealth;
            }
            richestCustomer = Math.max(richestCustomer, customerWealth);
        }
        System.out.println(richestCustomer);
    }
}
