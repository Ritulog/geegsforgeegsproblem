package arrays;// User function Template for Java

import java.util.ArrayList;

class FactorialOfNGFG {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int size =1;
        int carry =0;
        int val = 2;
        while(val<=n){
            for(int i=size-1; i>=0; i--){
                int temp = list.get(i)*val + carry;
                list.set(i, temp%10);
                carry = temp/10;
            }
            while(carry != 0){
                list.add(0, carry % 10);
                carry = carry/10;
                size++;
            }
            val++;
        }
        return list;
        
    }
}