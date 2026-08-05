class Solution {
   
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    void mergeSort(int[] nums, int low, int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,high,mid);
    }
    void merge(int[] nums, int low, int high, int mid){
        int i=low, j=mid+1, trace=0;
        int result[] = new int[high-low+1];
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                result[trace] = nums[i];
                trace++;
                i++;
            }
            else{
                result[trace] = nums[j];
                trace++;
                 j++;
            }
        }
        while(i<=mid){
            result[trace] = nums[i];
            trace++;
             i++;
        }
        while(j<=high){
            result[trace] = nums[j];
            trace++;
             j++;
        }
        int s = 0;
        for(int k =low; k<=high; k++){
            nums[k] = result[s];
            s++;
        }
    }
}