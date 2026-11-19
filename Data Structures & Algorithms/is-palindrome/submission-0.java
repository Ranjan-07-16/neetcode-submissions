class Solution {
    public boolean isPalindrome(String s) {
        String net="";
        String rev="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)==true)
            {
                net=net+ch;
            }
        }
        for(int i=0; i<net.length(); i++)
        {
            char ch=net.charAt(i);
            rev=ch+rev;
        }
        if(net.equalsIgnoreCase(rev)==true)
        return true;
        else
        return false;
    }
}