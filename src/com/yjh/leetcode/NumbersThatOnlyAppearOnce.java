package com.yjh.leetcode;

/*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:
输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4*/
public class NumbersThatOnlyAppearOnce {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);
	}

	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= nums.length; j++) {
				if (j == nums.length) {
					res = nums[i];
					return res;
				}
				if(nums[j] == nums[i] && i!=j){
					break;
				}
			}
		}
		return res;
	}
}
