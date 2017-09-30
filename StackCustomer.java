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
public class StackCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read the no of query
        int query = sc.nextInt();
        //make the stack variable
        Stack<Integer> stack = new Stack<>();
        //loop upto query
        for (int i = 0; i < query; i++) {
            //read the person identity
            int person = sc.nextInt();
            //if the person is cutomer
            if(person == 1) {
                //check the stack status
                //if empty return msg as no food
                if(stack.isEmpty())
                    System.out.println("No Food");
                //otherwise pop the top element and display it
                else
                    System.out.println(stack.pop());
            //if the person is chef then push the price in stack
            } else {
                stack.push(sc.nextInt());
            }
        }
    }
}
