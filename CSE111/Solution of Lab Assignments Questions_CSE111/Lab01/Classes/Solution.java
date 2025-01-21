class Solution {
    public int removeDuplicates(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        int count =0;
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(!bool[j])
                {
                    if(nums[i]==nums[j])
                    {
                        nums[j]=0;
                        bool[j]=true;
                        count++;
                    }
                }
            }
        }
    int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums2[i]=nums[i];
            }
        }
        return count;
    }
}