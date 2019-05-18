import java.util.stream.IntStream;

public class Slicing implements IntUnaryFunction{

    @Override
    public int[] firstSlicing(int[] a){
        int[] slice = IntStream.range(1, a.length).map(i -> a[i]).toArray();
//        for(int i = 0; i < slice.length; i++){
//            System.out.println(slice[i]);
//        }
        return slice;
    }

//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        firstSlicing(a);
//    }

}


