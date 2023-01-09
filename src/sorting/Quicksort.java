package sorting;

public class Quicksort {

    public void sort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            sort(arr, left, index - 1);
        }
        if (index < right) {
            sort(arr, index, right);
        }

    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;

            while (arr[right] > pivot) right--;

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    public static void main(String args[]) {
        int[] input = new int[]{10,6,3,100,5,8,2,7};
        Quicksort s = new Quicksort();
        s.sort(input, 0, input.length-1);
        for(int i : input) {
            System.out.println(input[i]);
        }
    }
}
