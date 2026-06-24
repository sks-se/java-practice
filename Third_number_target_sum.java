public class Third_number_target_sum.java {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 8, 1}; int target = 11;
        int[] array1 = {3, 7, 4, 12, 5, 2}; int target1 = 9;
        int[] array2 = {3, 1, 4, 0, 5, 2}; int target2 = 7;
        int[] array3 = {3, 1, 0, 4, 5, 7, 2}; int target3 = 5;
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
        int first_idx, second_idx, third_idx, i, j, k;
       
        for (i = 0; i < n - 2; i++) { // first number
            first_idx = i;
            for (j = i+1; j < n-1; j++) { // second number
                second_idx = j;
                for(k = j +1; k < n; k++){ // third number
                    third_idx = k;
                if ((arr[first_idx] + arr[second_idx] + arr[third_idx]) == target) {
                    int[] pair = {arr[first_idx], arr[second_idx], arr[third_idx]};
                    ans++;
                    displayArray(pair);
                }}
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
