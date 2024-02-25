package main.web.servlet;

public class test {
    public static void main(String[] args) {
        String test = "1010";
        System.out.println(convertBinaryToDecimal(test));
    }

    protected static long convertBinaryToDecimal(String value) {
        char[] binaryArr = value.toCharArray();

        long sum = 0;
        int pow = 0;
        for (int i = binaryArr.length - 1; i >= 0; i--) {
            int digitValue = binaryArr[i] - '0';
            if (digitValue == 1) {
                sum += Math.pow(2, pow);
            }
            pow++;
        }

        return sum;
    }
}
