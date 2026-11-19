class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum=0;
        int problems=0;
        int solved=0;
        for(int i=0; i<bills.length; i++)
        {
            if(bills[i]==5)
            {
                sum+=5;
            }
            else
            {
                problems++;
                int rval=bills[i]-5;
                if(sum>=rval)
                {
                    solved++;
                }
                sum+=5;
            }
        }
        if(problems==solved)
        return true;
        else
        return false;
    }
}