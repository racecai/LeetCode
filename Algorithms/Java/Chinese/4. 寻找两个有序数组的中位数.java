����������СΪ m �� n ���������� nums1 �� nums2��

�����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��

����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�


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
//�鲢����
    
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