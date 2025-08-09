public class SecondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {23, 43, 56, 34};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second maximum element: " + secondMax);
    }
}
