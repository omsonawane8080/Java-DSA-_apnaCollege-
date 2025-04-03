class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        quicksort(arr, 0, arr.length - 1);
        
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
