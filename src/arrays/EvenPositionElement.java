package arrays;

import java.util.stream.IntStream;

public class EvenPositionElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,5,6};
        for(int i=0; i<array.length; i=i+2){
            System.out.println("even postion element"+array[i]);
        }
        IntStream.range(0,array.length).filter(i->i%2==0).map(i->array[i]).forEach((System.out::println));
    }
}
