import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable, instead of
        // declaring separate variables for each value.

        // To declare an array, define the variable type with square brackets:

        String name[]={"hari", "sita", "madhu", "rabi"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        name[1]="kanha";
        for (String e: name) {
            System.out.println(e);
        }
        
    }
}
