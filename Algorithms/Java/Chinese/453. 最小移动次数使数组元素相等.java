
给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
class Solution {
    public int minMoves(int[] nums) {
        int min;
        min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int re=0;
        for(int j=0;j<nums.length;j++){
            re=re+(nums[j]-min);
        }
        return re;
    }
}