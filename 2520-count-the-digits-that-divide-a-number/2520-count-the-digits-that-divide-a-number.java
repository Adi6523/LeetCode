class Solution {
    public int countDigits(int num) {
        int number=num,divisor,count=0;
        while(number!=0)
        {
            divisor=number%10;
            number/=10;
            if(num%divisor==0)
            {
                count++;
            }
        }
        return count;
    }
}