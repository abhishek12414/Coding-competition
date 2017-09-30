/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        
        for (int i = N-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        
    }
}
