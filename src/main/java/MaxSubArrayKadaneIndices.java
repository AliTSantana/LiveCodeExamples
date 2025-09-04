public class MaxSubArrayKadaneIndices {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, -4};
        Result result = maxSubArray(nums);
        System.out.println("Max Sum: " + result.maxSum);
        System.out.println("Max Sub-array: ");
        for (int i = result.start; i <= result.end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static Result maxSubArray(int[] nums) {
        int maxActual = nums[0];
        int maxGlobal = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxActual + nums[i]) {
                maxActual = nums[i];
                tempStart = i;
            } else {
                maxActual += nums[i];
            }

            if (maxActual > maxGlobal) {
                maxGlobal = maxActual;
                start = tempStart;
                end = i;
            }
        }

        return new Result(maxGlobal, start, end);
    }

    static class Result {
        int maxSum;
        int start;
        int end;

        Result(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.start = start;
            this.end = end;
        }
    }
}

