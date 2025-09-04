public class maxSubArrayKadane {
    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{-2, 1,-3,4,-1, 2, 1,-5,-4}));
    }
    private static int maxSubArray(int[] nums) {
        int maxActual = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxActual = Math.max(nums[i], maxActual + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxActual);
        }
        return maxGlobal;
    }
}
