public class Only14 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 4};

        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}