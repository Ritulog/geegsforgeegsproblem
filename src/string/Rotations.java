package string;

class Rotations {
    public boolean areRotations(String s1, String s2) {
        // code here
        if(s2.length()!=s1.length()){
            return false;
        }
        String rotated = s1+s1;
        int j=0;
        int count = 0;
        for(int i=0; i<rotated.length(); i++){
            if(j==s2.length()){
                break;
            }
            if(rotated.charAt(i) == s2.charAt(j)){
                j++;
                count++;
            }
        }
        if(count == s2.length()){
            return true;
        }
        return false;
    }
}