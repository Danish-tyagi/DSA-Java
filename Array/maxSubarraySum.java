public class maxSubarraySum {
    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max Subarray sum is :" + ms);
    }

    public static void main(String[] args) {
        int number[] = { -2, -5, 4, -7, 6, -3, 5, 2, 1 };
        kadanes(number);
    }
}
