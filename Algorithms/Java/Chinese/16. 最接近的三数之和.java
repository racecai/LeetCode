给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i=0,j=1,z=2,l=nums.length;
        int min= Integer.MAX_VALUE ;
        int add=0,sub=0,am=0;
        for(i=0;i<l;i++){
            for(j=i+1;j<l;j++){
                for(z=j+1;z<l;z++){
                    add=nums[i]+nums[j]+nums[z];
                    sub=Math.abs(add-target);
                  if(min>sub){
                      am=add; 
                      min=sub;
                }
                    
            }
        }
        }
        return am;
    }
}

方法2
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 排序
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的
                    return target;
                }

            }

        }

        return closestNum;
    }

}