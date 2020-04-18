public class Leetcode_26_RemoveDup{

    /**
     * 1、0为起始位置，肯定是不重复的，记录为无重复索引位置singlePos
     * 2、从1开始递归，跟0位置比较，如果相同，则向后继续查询，找到第一个不等的数据，索引位置假设为k
     * 3、将k位置的数据放到singlePos后面，singlePos索引++
     * @param args
     */
    public int removeDuplicates(int[] nums) {
        int singlePos = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[singlePos]) {
                nums[++singlePos] = nums[i];
            }
        }
        return singlePos + 1;
    }
}