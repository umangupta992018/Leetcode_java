class Solution {
    public int myAtoi(String str) 
    {
        if(str==null||str.length()<1) return 0;
        str=str.replaceAll("^\\s+","");
        int i=0;
        boolean isnegative=str.startsWith("-");
        boolean ispositive=str.startsWith("+");
        if(isnegative)
        {
            i++;
        }
        else if(ispositive)
        {
            i++;
        }
        
        double number=0;
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            number = number*10 + (str.charAt(i)-'0');
            i++;
        }
        number = isnegative ? -number:number;
        if(number<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        else if(number>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        return (int)number;
    }
        // s = s.trim();
        
        // if (s.isEmpty()) return 0; 
        
        // int i = 0;
        // boolean negative = false;
        
        // if (s.charAt(0) == '-') {
        //     negative = true;
        //     i++;
        // } else if (s.charAt(0) == '+') {
        //     i++;
        // }

        // int result = 0;
        // int maxDiv10 = Integer.MAX_VALUE / 10;
        // while (i < s.length() && Character.isDigit(s.charAt(i))) {
        //     int digit = s.charAt(i) - '0';
        //     if (result > maxDiv10 || (result == maxDiv10 && digit > 7)) {
        //         return (negative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        //     }
        //     result = result * 10 + digit;
        //     i++;
        // }
        
        // return (negative) ? -result : result;
    
}