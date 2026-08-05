class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
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
        
        for(int k=0; k<m+n; k++){//yha ans num1 array ke andr hi chahiye
            nums1[k] = result[k];
        }
        
    }
}