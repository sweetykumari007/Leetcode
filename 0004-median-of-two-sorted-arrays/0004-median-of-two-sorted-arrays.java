class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        int i=0, j=0, trace=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[trace]=nums1[i];
                trace++;
                i++;
            }
            else{
                result[trace]=nums2[j];
                trace++;
                j++;
            }
        }
        while(i<m){
            result[trace]=nums1[i];
            trace++;
            i++;
        }
        while(j<n){
            result[trace]=nums2[j];
            trace++;
            j++;
        }

        int mid = (0 + result.length - 1) / 2;

        if(result.length % 2 == 0) {
            return (result[mid] + result[mid + 1]) / (double) 2;
        }

        else {
            return result[mid];
        }

    }
}