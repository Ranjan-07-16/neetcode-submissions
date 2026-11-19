class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum=0;
        int fives=0;
        int tens=0;
        int twenties=0;
        int problems=0;
        int solved=0;
        for(int i=0; i<bills.length; i++)
        {
            if(bills[i]==5)
            {
                fives+=1;
                sum+=5;
            }
            else if(bills[i]==10)
            {
                tens+=1;
                problems++;
                sum+=10;
                int rval=10-5;
                if(sum>=rval)
                {
                    if(fives>0)
                    {
                        solved++;
                    }
                }
            }
            else
            {
                twenties+=1;
                problems++;
                sum+=20;
                int rval=20-5;
                if(sum>=rval)
                {
                    if(fives>=3 || (tens>=1 && fives>=1))
                    {
                        solved++;
                    }
                }
            }
        }
        if(problems==solved)
        return true;
        else
        return false;
    }
}