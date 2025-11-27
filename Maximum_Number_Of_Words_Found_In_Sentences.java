package JavaDSA_Practice;

public class Maximum_Number_Of_Words_Found_In_Sentences {
    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            int max = 0;
            for (int j = 0; j < sentences[i].length() - 1; j++) {
                max = sentences[i].split(" ").length;
            }
            maxLength = Math.max(maxLength, max);
        }
        System.out.println(maxLength);
    }
}
