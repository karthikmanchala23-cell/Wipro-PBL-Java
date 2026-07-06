public class WithoutTen {
    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};
        int[] result = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}