class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1 && s.charAt(0) == ' '){
    return 0;
} else if(s.length() == 1){
    return 1;
}
int i = s.length() - 1;
int ans = 0;
if(s.charAt(s.length() - 1) == ' '){
    while(i >= 0 && s.charAt(i) == ' '){
        i--;
    }
}
while(i >= 0 && s.charAt(i) != ' '){
    ans++;
    i--;
}
return ans;
    }
}