public class MergeSort {
    public static String[] mergeSort(String[] array) {
        if (array == null) {
            return null;
        }

        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        String[] leftArray = new String[mid];
        String[] rightArray = new String[array.length - mid];

        System.arraycopy(array, 0, leftArray, 0, leftArray.length);
        System.arraycopy(array, mid, rightArray, 0, rightArray.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);

        return array;
    }

    public static void merge(String[] arr, String[] leftHalf, String[] rightHalf) {
        int leftIndex = 0, rightIndex = 0, arrIndex = 0;

        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            if (leftHalf[leftIndex].compareTo(rightHalf[rightIndex]) <= 0) {
                arr[arrIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                arr[arrIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }

        while (leftIndex < leftHalf.length) {
            arr[arrIndex] = leftHalf[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        while (rightIndex < rightHalf.length) {
            arr[arrIndex] = rightHalf[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}

