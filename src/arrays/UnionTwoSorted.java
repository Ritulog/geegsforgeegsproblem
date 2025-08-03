package arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionTwoSorted {
    static ArrayList<Integer> findUnion(int a[],
                                        int b[]) {
        Set<Integer> st = new TreeSet<>();

        // Put all elements of a[] in st
        for (int i = 0; i < a.length; i++)
            st.add(a[i]);

        // Put all elements of b[] in st
        for (int i = 0; i < b.length; i++)
            st.add(b[i]);

        ArrayList<Integer> res = new ArrayList<>(st);
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 2, 4 };
        int b[] = { 2, 2, 4, 4 };

        ArrayList<Integer> res = findUnion(a, b);

        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
    }

}
