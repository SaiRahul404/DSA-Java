public class CountFreqNew {
    public static void main(String[] args) {
        int[] arr = {10, 30, 10, 20, 10, 20, 30, 10};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void countFreq(int[] arr) {
        int n = arr.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times.");
                count = 1; // reset the count to 1 , to count the next occurences
            }
        }
    }
}

//[2,3,3,4,5,5]
