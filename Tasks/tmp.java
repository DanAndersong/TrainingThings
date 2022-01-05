import java.util.Arrays;

public class tmp {
    public static void main(String[] args) {
        int[] arr = new int[] {531,235,6,462,35,65,7,7,57,5,3};

        System.out.println(Arrays.toString(find(arr, 241)));

    }

    public static Object[] find (int[] arr, int i) {
        Object[] result = new Object[]{null, null};
        if (arr.length < 2) {
            return result;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = j; k < arr.length; k++) {
                if (arr[j] + arr[k] == i) {
                    result[0] = arr[j];
                    result[1] = arr[k];
                    break;
                }
            }
        }

        return result;
    }
}
