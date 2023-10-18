class Solution {
    public int romanToInt(String s) {   
        int ans = 0, num = 0;
        Map<Character, Integer> hashMap  = new HashMap<Character, Integer>() {{ 
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
            }};                                   
        int sum=0;
        s = s.replace("IV", "IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD", "CCCC");
        s=s.replace("CM", "DCCCC");
        for (char c:s.toCharArray()){
             sum+=hashMap.get(c);
        }
        return sum;
    }
}
