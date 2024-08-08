import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Azad", "Hanna", "Filip", "Aleksandr"};

        MergeSort.mergeSort(array);

        System.out.println(Arrays.toString(array));

    }
}