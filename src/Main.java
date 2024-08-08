import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayMergeSort = {"Azad", "Hanna", "Filip", "Aleksandr"};

        MergeSort.mergeSort(arrayMergeSort);
        System.out.println(Arrays.toString(arrayMergeSort));

        String[] arrayBubleSort = {"Hlib", "Kevin", "Hubert", "Maksymilian"};
        BubleSort.bubleSort(arrayBubleSort);
        System.out.println(Arrays.toString(arrayBubleSort));
    }
}