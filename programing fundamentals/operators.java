public class operators {
    public static void main(String[] args) {
        // Operators: these are the symblos that us e to perform operation between two
        // operands.
        // Java divides the operators into the following groups:

        // Arithmetic operators
       int a=15;
        int b=5;
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(--a);
        

        // Assignment operators
        int a=5;
        int b=2;
        System.out.println(b*=5);

        // Comparison operators
        int a=5;
        int b=10;
        System.out.println(a<=b);

        // Logical operators
        int a=5;
        int b=12;
        System.out.println(a<b&&b>a);
        System.out.println(a>b||b>a);
        System.out.println(!(b>a));
        // Bitwise operators
    }
}
