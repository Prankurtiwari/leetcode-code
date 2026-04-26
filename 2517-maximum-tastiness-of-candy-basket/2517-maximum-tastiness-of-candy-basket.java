class Solution {

    public static boolean canPick (int gap, int[] price, int k) {
        int i =1;
        int lastPrice = price[0];
        int n = price.length;
        int count =1;
        for(i=1; i<n; i++) {

            if ((price[i] - lastPrice) >= gap) {
                count++;
                lastPrice = price[i];

                if (count == k) return true;
            }
        }

        return false;
    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int n = price.length;

        int low =0;
        int high = price[n-1];
        int res = 0;
        while(low <= high) {

            int mid = low + (high-low)/2;

            if (canPick(mid, price, k)) {
                res = mid;
                low = mid+1;
            } else {
                high = mid -1;
            }
        }

        return res;
    }
}