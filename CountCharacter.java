/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int nos = sc.nextInt();
        String input = sc.nextLine();
        char[ ] a = null;
//        while(nos-- > 0) {
            for(int i=0; i<input.length(); i++) {
                a[input.charAt(i)] ++;
            }
//        }
for(int i=0; i<input.length(); i++) {
                System.out.println(a[input.charAt(i)]);
            }
    }
}
