   public int missingNumber(int[] nums) {
        int n = nums.length;

        //期待值，使用等差数列求和公式计算
        int total = n * (n + 1) / 2;

        //循环遍历一遍数组，计算出缺失数据后的值arrSum
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }
        //期待值-当前值=缺失值
        return total - arrSum;
    }