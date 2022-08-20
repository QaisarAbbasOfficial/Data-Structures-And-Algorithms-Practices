/*
 * @created 18/08/2022 - 1:06 PM
 * @project DataStructure
 * @package PACKAGE_NAME
 * @author Qaisar Abbas
 */

import com.sun.source.tree.BinaryTree;

import java.util.*;

public class Algorithm {
    /*
    * Algorithms
    *
    * Step by step procedure is called algorithm
    * */

    /*
    * 1. Take 2 numbers
    * 2. Add them with + operators
    * 3. Display the result
    * */

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        System.out.println(algorithm.sum(8));
    }

    public int sum(int value){
        return value + sum(10);
    }
}
