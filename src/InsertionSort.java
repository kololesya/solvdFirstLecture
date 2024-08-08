public class InsertionSort {
    public static String[] insertionSort(String[] array) {
        if (array == null) {
            return null;
        }

        if (array.length <= 1) {
            return array;
        }

        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key;
            for (int j = 0; j < n - 1; j++) {
                if (array[i].compareTo(array[j]) <= 0) {
                    key = array[j];
                    array[j] = array[i];
                    array[i] = key;
                    i++;
                }
            }
        }
        return array;
    }
}
