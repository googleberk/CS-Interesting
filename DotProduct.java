// Goal: this code shows how to do the dot product
// of two vectors stored in two int[]


public class DotProduct{

    /**
     *
     * The dot product of two vectors a = [a1, a2, …, an]
     * and b = [b1, b2, …, bn] is defined:
     *
     */

    public static int dotProduct(int[] a, int[] b){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i] * b[i];
        }
        return sum;
    }


    /*
    Note: try to implement this using recursion. AND Higher-Order-Functions by passing
           a function object f, which makes a becomes a[1:]
     */

    /*
    Note2: we could just use instantiate a new Slicing(), but in order not to change this frequently,
    (next time, you want to apply a different unary mapping, you don't need to change the instantiation
    code if you use a higher interface called IntUnaryFunction and with new IntUnaryFunction();
     */

    public static int dotProductHR(int[] a, int[] b, Slicing f){
        if(a.length == 1 && b.length == 1){
            return a[0] * b[0];
        }
        return a[0] * b[0] + dotProduct(f.firstSlicing(a), f.firstSlicing(b));
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {5, 6};
        System.out.println("Dot Product is: " + dotProduct(a, b));
        System.out.println("Dot Product is: " + dotProductHR(a, b, new Slicing()));
    }
}

