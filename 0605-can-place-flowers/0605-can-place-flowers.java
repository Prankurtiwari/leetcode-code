class Solution {
    // https://www.youtube.com/results?search_query=Can+Place+Flowers+-+Leetcode+605
    
    public boolean canPlaceFlowers(int[] flowerbed, int flo) {
       int n = flowerbed.length;
        int[] arr = new int[n+2];
        
        for(int i=0; i<n; i++) {
           arr[i+1] =  flowerbed[i];
        }
        
        for(int i= 1; i<=n;i++) {
            if (arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0) {
                arr[i] =1;
                flo--;
            }
        }
        
        return flo <= 0;
    }
}