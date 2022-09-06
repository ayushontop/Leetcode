class Solution {
 public int[] plusOne(int[] digits) {
   	int carry = 0;
	int i = digits.length - 1;
	while (digits[i] == 9 && i > 0) {
		digits[i] = 0;
		i--;
	}
	if (digits[0] == 9 && i == 0) {
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	} else {
		digits[i] = digits[i] + 1;
	}
	return digits;
}
}