/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class HashsetSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read input from user
        String input = sc.nextLine();
        //create hashset
        HashSet<Character> hashSet = new HashSet<>();
        //character variable to store character data
        char c;
        //loop up to string length
        for(int i=0; i<input.length(); i++) {
            //read single character at a pos
            c = input.charAt(i);
            //check if character is not available in hashset
            //then display it and store inside the hashset.
            if(!hashSet.contains(c)) {
                System.out.print(c);
                hashSet.add(c);
            }
        }    
    }
}
