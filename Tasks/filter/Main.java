package filter;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
//
//    static Object[] filter(Object[] array , Filter filter) {
//        int offset = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (!filter.apply(array[i])) {
//                offset++;
//            } else {
//                array[i - offset] = array[i];
//            }
//
//        }
//        return Arrays.copyOf(array,  array.length - offset);
//    }

    static <T> T[] filter(T[] array, Function<? super T, Boolean> filter) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {

//       String[] newArr = (String[]) filter(new String[]{"aa", "bb", "ccc", null, "some"}, new Filter() {
//           @Override
//           public boolean apply(Object o) {
//               return o != null;
//           }
//       });

        String array[] =
                new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] newArray = filter(array, s -> s != null);
        System.out.println(Arrays.toString(array));
    }
}
