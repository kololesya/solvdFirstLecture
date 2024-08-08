import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayMergeSort = {"Hanna", "Azad", "Filip", "Aleksandr"};
        MergeSort.mergeSort(arrayMergeSort);
        System.out.println(Arrays.toString(arrayMergeSort));

        String[] arrayBubleSort = {"Kevin", "Hubert", "Maksymilian", "Hlib"};
        BubleSort.bubleSort(arrayBubleSort);
        System.out.println(Arrays.toString(arrayBubleSort));

        String[] arrayInsertionSort = {"Oskar", "Marcin", "Olesya", "Pavel"};
        InsertionSort.insertionSort(arrayInsertionSort);
        System.out.println(Arrays.toString(arrayInsertionSort));

    }
}