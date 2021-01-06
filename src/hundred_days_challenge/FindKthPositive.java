package hundred_days_challenge;

/**
 * @author abdelrahmanelessawy, 06/01/2021
 */
public class FindKthPositive {

    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        int prev = 0;
        for (int n : arr) {
            missing += n - prev - 1;
            if (missing >= k) {
                return n - (missing - k + 1);
            }
            prev = n;
        }
        return prev + k - missing;
    }

    public int findKthPositiveV2(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (end - start) + start;
            if (arr[mid] - mid <= k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
