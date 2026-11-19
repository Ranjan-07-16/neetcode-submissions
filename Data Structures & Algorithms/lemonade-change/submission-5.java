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
                tens++;
                problems++;
                int rval=5;
                if(sum>=rval)
                {
                    if(fives>=1)
                    {
                        fives--;
                        solved++;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
                sum+=5;
            }
            else
            {
                twenties++;
                problems++;
                int rval=15;
                if(sum>=rval)
                {
                    if(fives>=3)
                    {
                        fives=fives-3;
                        solved++;
                    }
                    else if(fives>=1 && tens>=1)
                    {
                        fives--;
                        tens--;
                        solved++;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
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