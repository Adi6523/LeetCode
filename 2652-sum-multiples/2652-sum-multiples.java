class Solution {
    public int sumOfMultiples(int n) {
        int sum=0,val;
        for(int i=0;i<=n;i++)
        {
            val=i;
            if(val%3==0||val%5==0||val%7==0)
            {
                sum+=val;
            }
        }
        return sum;
    }
}