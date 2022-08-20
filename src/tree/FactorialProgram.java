package tree;

/*
 * @created 20/08/2022 - 12:32 PM
 * @project DataStructure
 * @package tree
 * @author Qaisar Abbas
 */

public class FactorialProgram {

    public static int recursion(int n){
        if (n == 0){
            return 1;
        }else {
            return (n * recursion(n - 1));
        }
    }

    public static void main(String[] args) {


        //Using For Loop
        int i, fact = 1;
        int n = 4;

        for (i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println(fact);

        System.out.println(recursion(4));
    }
}
