class Solution {
    public int addDigits(int num) {
        /* solution 1
        
        while(num > 9) {
            int sum = 0;
            while(num > 0) {
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        return num;
        
        */
        
        /* solution 2 : recurssion */

        if(num <= 9) {
            return num;
        }
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        return addDigits(sum);   
    }
        
    }
}
