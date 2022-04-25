class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length;
       if(digits[n-1]!=9)
       {
        digits[n-1]+=1;
           return digits;
       }
        
        boolean slot = false;
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9 && i == 0) {
                slot = true;
                digits[i] = 0;
            }
            else if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            else {
                digits[i] += 1;
                break;
            }
        }
        
        if (slot) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 1; i < digits.length-1; i++) {
                result[i] = digits[i];
            }
            return result;
        }
        return digits;

        
   }
}
