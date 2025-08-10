public class CountFrequency {
    public static void main(String[] args) {

        int[] arr = {10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        boolean[] visited = new boolean[n]; // intially by default the array is set to false

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");

        }
    }
}
