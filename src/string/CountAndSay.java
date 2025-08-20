package string;

class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(4));
    }

    static String countAndSay(int n) {
       if(n == 1){
        return "1";
       } 

       //recursion
       String s = countAndSay(n-1);
      // String res = "";
      StringBuilder res = new StringBuilder();
       int counter = 0;
       for(int i=0; i<s.length(); i++){
        counter++;
        //segregatting into groups
        if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
            //res = res+counter+s.charAt(i);
            res = res.append(counter).append(s.charAt(i));
            counter = 0;
        }
       }
       return res.toString();
    }
}