
����һ������Ϊ n �ķǿ��������飬�ҵ�����������Ԫ����ȵ���С�ƶ�������ÿ���ƶ�����ʹ n - 1 ��Ԫ������ 1��
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