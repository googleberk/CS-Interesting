package Core0516;

import java.util.stream.IntStream;


public class Slicing implements IntUnaryFunction {

    @Override
    public int[] firstSlicing(int[] a) {
//        for(int i = 0; i < slice.length; i++){
//            System.out.println(slice[i]);
//        }
        return IntStream.range(1, a.length).map(i -> a[i]).toArray();
    }

//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        firstSlicing(a);
//    }

}


