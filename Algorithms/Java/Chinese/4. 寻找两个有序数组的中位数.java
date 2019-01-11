给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

你可以假设 nums1 和 nums2 不会同时为空。


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int[] sorted = mergeSort(nums1, nums2);
        
        if (sorted.length%2!=0) {
            return sorted[total/2] / 1.0;
        } 
        
        return (sorted[total/2 - 1] + sorted[total/2]) / 2.0;
        
    }
//归并排序
    
    public int[] mergeSort(int[] nums1, int[] nums2) {
         int m = nums1.length, n = nums2.length;
        int total = m + n;
        int[] res=new int[total] ;
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
            }else {
                res[k++]=nums2[j++];
            }
        }
        while(i<m)
            res[k++]=nums1[i++];
        
        while(j<n)
            res[k++]=nums2[j++];
        
         return res; 
        }
        
        
    
}