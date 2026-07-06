public class ArraySearch {
    public static void main(String[] args) {

        int[] arr = {1, 4, 34, 56, 7};
        int search = 56;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}