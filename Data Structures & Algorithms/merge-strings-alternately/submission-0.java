class Solution {
    public String mergeAlternately(String word1, String word2) {

        int l1=word1.length();
        int l2=word2.length();
        int imp=0;
        String net="";

        if(l1<l2)
        imp=l1;
        else if(l2<l1)
        imp=l2;
        else
        imp=l1;

        for(int i=0; i<imp; i++)
        {  
            net=net+word1.charAt(i)+word2.charAt(i);
        }
        if(l1<l2)
        {
            net=net+word2.substring(imp, word2.length());
        }
        else
        {
            net=net+word1.substring(imp, word1.length());
        }
        return net;
    }
}