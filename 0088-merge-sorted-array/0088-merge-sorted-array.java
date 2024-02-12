class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j=0;
        for(;i<m && j<n;) {
            if(nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else if(nums1[i] > nums2[j]) {
                result.add(nums2[j]);
                j++;
            } else {
                result.add(nums2[j]);
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        while(i<m) {
           result.add(nums1[i]);
            i++;
        }
         while(j<n) {
           result.add(nums2[j]);
            j++;
        }
        for(int ptr =0 ; ptr<n+m; ptr++) {
            nums1[ptr] = result.get(ptr);
        }
        
    }
}