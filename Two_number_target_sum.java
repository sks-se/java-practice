public class Two_number_target_sum {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 6, 8, 1}; int target = 11;
        int[] array1 = {3, 7, 4, 12, 5, 2}; int target1 = 9;
        int[] array2 = {3, 34, 4, 12, 5, 2}; int target2 = 7;
        int[] array3 = {3, 1, 0, 4, 5, 7, 2}; int target3 = 4;
        displayArray(array);
        targetSum(array, target);
        displayArray(array1);
        targetSum(array1, target1);
        displayArray(array2);
        targetSum(array2, target2);
        displayArray(array3);
        targetSum(array3, target3);
    }

    public static void targetSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        int first_idx, second_idx, i, j;
       
        for (i = 0; i < n - 1; i++) {
            first_idx = i;
            for (j = i+1; j < n; j++) {
                second_idx = j;
                if ((arr[first_idx] + arr[second_idx]) == target) {
                    int[] pair = {arr[first_idx], arr[second_idx]};
                    ans++;
                    displayArray(pair);
                }
                                }
            }
        }


    public static void displayArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
