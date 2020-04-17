public class Leetcode_283_moveZeroes{

    /**
     * 1前面有1个0，那么1就要往前移动1个位置；3前面有2个0，那么3就往前移动2个位置；12前面也有2个0，则12往前移动2个位置
     * 移动位置后的位置，直接赋值为0即可，无需元素交互。
     */

    /**
     * 执行过程：
     * i=0，zeroNums=0，[0,1,0,3,12]
     * i=1，zeroNums=1，[1,0,0,3,12]
     * i=2，zeroNums=1，[1,0,0,3,12]
     * i=3，zeroNums=2，[1,3,0,0,12]
     * i=4，zeroNums=2，[1,3,12,0,0]
     */

    public static void moveZeroes(int[] nums) {

        int zeroNums = 0, len = nums.length;

        for (int i=0;i<len;i++) {
            if( nums[i] == 0 ) {
                zeroNums++;
            } else {
                if (zeroNums>0) {
                    nums[i-zeroNums] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }

}