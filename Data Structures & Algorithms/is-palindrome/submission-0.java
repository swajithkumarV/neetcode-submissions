class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;
        String c = s.toLowerCase();

        while(a<b){
            while(a<b && !Character.isLetterOrDigit(c.charAt(a))){
                a++;

            }
            while(a<b && !Character.isLetterOrDigit(c.charAt(b))){
                b--;

            }
            
            if(c.charAt(a)!=c.charAt(b)){
                return false;
                
                
            }
            a++;
            b--;
        }
        return true;
    }
}
