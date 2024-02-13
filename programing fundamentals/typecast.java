public class typecast {
    public static void main(String[] args) {
        // Type casting is when you assign a value of one primitive data type to another type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        byte a=5;
        int b=a;
        System.out.println(b);

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double x=3.56;
        float y=(float)x;
        System.out.println(y);
    }
}
