class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        for(int i = 0 ; i < product.length ; i++)
            product[i]=1;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j]!=nums[i])
                    product[i]*=nums[j];
            }
        }
        return product;
    }
}  

