public class conditional {
    public static void main(String[] args) {
        // Conditional: these are the statement in java which only runs when codition is satisfy.
        // Java has the following conditional statements:
        boolean btn=true;
        int score=9;
        // Use if to specify a block of code to be executed, if a specified condition is true
        if (btn==true) {
            System.out.println("ON");
        }
        // Use else to specify a block of code to be executed, if the same condition is false
        if (btn==true) {
            System.out.println("ON");
        }
        else{
            System.out.println("OFF");
        }
        // Use else if to specify a new condition to test, if the first condition is false
            if (score>=9) {
                System.out.println("O");
            }
            else if(score>=7){
                System.out.println("A");
            }
            else if(score>=4){
                System.out.println("B");
            }
            else{
                System.out.println("F");
            }
        // Use switch to specify many alternative blocks of code to be executed
        int a=4; int b=5; char op='*';
                switch (op) {
                    case '+':
                        System.out.println(a+b);
                        break;
                        case '-':
                        System.out.println(a-b);
                        break;
                        case '*':
                        System.out.println(a*b);
                        break;
                        case '/':
                        System.out.println(a/b);
                        break;
                    default:
                    System.out.println("Sorry sir.");
                        break;
                }
    }
}
