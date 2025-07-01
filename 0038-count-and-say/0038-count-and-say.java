class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String say = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        // String res="";
        int counter = 0;
        // System.out.println(say.length());
        for(int i=0;i<say.length();i++)
        {
            counter++;
            if(i==say.length()-1 || say.charAt(i)!=say.charAt(i+1)){
                res.append(counter).append(say.charAt(i));//+say.charAt(i);
                counter=0;
            }
        }
        return res.toString();
        // String result="";
        // for(int i=0;i<say.length();i++){
        //     char ch[]=say.charAt(i);

        //     int count = 0;

        //     while(i<say.length()-1 && say[i] == say[i+1]){
        //         count++;
        //         i++;
        //     }

        //     result += Integer.toString(count) + String.valueOf(ch);
        // }
        // return result;
    }
}