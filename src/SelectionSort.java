public class SelectionSort {
    public static void selectionSort (String[] array){

        for (int j = 0; j < array.length-1; j++){
            int min = j;
            for (int i= j + 1; i < array.length; i++)
                if (array[i].compareTo(array[min]) < 0 ) {
                    min = i;
                }
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }

    }
}
