/*
 * @created 18/08/2022 - 9:50 PM
 * @project DataStructure
 * @package PACKAGE_NAME
 * @author Qaisar Abbas
 */

import java.util.Scanner;

public class CustomArray {


    public static void main(String[] args) {
      int[] price = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < price.length; i++){
            price[i] = in.nextInt();
        }

        for (int i = 0; i < price.length; i++){
            System.out.println(price[i]);
        }
    }
}
