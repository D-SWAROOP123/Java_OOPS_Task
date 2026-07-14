public class LoopsConditionsArrays {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int n : nums) {
            if (n % 20 == 0) {
                System.out.println(n + " is divisible by 20");
            } else {
                System.out.println(n + " is not divisible by 20");
            }
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}
