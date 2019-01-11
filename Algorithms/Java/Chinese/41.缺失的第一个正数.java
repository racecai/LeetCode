class Solution {
    public int firstMissingPositive(int[] nums) {   
        int lens=nums.length;
        if(lens==0)
            return 1;
        Arrays.sort(nums);
        int max=nums[lens-1];
        int[] nums1= new int[lens+max+1];
        int d;
        for(int i=0;i<lens;i++){
            if(nums[i]>0){
                d=nums[i];
                nums1[d]=1;}
            
        }
        int am=1;
        for(int i=1;i<(lens+max+1);i++){
            if(nums1[i]!=1){
                am=i;
                break;
            }
        }
        return am;
    }
}