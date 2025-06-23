class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int[] hash = new int[256];
        int len=0;
        int maxlen=0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int hash[]=new int[256];
            for(int j=i;j<ch.length;j++)
            {
                if(hash[ch[j]]==1) break;
                len=j-i+1;
                maxlen=Math.max(len,maxlen);
                hash[ch[j]]=1;
            }
        }
        return maxlen;
    }
}