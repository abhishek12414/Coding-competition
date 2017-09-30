/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Abhi
 */
public class FootballFest {

    public static void main(String[] args) {
//        Stack<Integer> pass = new Stack<>();
//        Stack<Integer> back = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

//        while (testcase-- > 0) {
//            int noOfPass = sc.nextInt();
//            pass.add(sc.nextInt());
//            String currentMove = null;
//            String previousMove;
//            while (noOfPass-- > 0) {
//                previousMove = currentMove;
//                currentMove = sc.next();
//                if (currentMove.contains("P")) {
//                    pass.add(sc.nextInt());
////                    System.out.println("----> in " + currentMove + "   " + pass.peek());
//                } else if (currentMove.contains(previousMove)) {
//                    pass.add(back.pop());
//                } else if (currentMove.contains("B")) {
//                    back.add(pass.pop());
////                    System.out.println("---> out " + previousMove + "  " + pass.peek());                   
//                }
//            }
//            System.out.println("Player " + pass.peek());
//        }
        int p, b = 0;
        while (testcase-- > 0) {
            int noOfPass = sc.nextInt();

            p = sc.nextInt();
            String currentMove = null;
            String previousMove;

            while (noOfPass-- > 0) {
                previousMove = currentMove;
                currentMove = sc.next();
                if (currentMove.contains("P")) {
                    b = p;
                    p = sc.nextInt();
//                    System.out.println("----> p " + p + "   ----> b " + b);
                } else {
//                    System.out.println("back comes");
                    int temp = b;
                    b = p;
                    p = temp;
//                    System.out.println("----> p " + p + "   ----> b " + b);
                }
            }
            System.out.println("Player " + p);
        }
    }
}
