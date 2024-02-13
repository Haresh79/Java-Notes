public class loop {
    public static void main(String[] args) {
        // Loops: can execute a block of code as long as a specified condition is reached.
        // loops are 2 types in java
        // Entry-control: while, for.
        int a=1;
        while (a<=5) {
            System.out.println(a);
            a++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        //break, continue keyword
        for (int i = 0; i < 5; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if(i==4){
                continue;
            }
            System.out.println(i);
        }

        // Exit-control: do-while.
        int b=1;
        do {
            System.out.println(b);
            b++;
        }while (b>=5);
    }
}
