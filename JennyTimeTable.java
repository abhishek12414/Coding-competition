/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class JennyTimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a1[] = new int[len];
        int a2[] = new int[len];
        for(int i=0; i<len; i++) {
            a1[i] = sc.nextInt();
        }
        for(int i=0; i<len; i++) {
            a2[i] = sc.nextInt();
        }
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        System.out.println(a1[a1.length-1] * a2[a2.length-1]);
    }
}
