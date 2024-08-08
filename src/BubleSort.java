public class BubleSort {

    public static void bubleSort(String[] array) {

        String temp;
        int arrayLength = array.length;

        for (int j = 0; j < arrayLength; j++) {
            for (int i = j + 1; i < arrayLength; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
