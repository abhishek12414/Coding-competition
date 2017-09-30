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
public class CountCars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while (--testCase >= 0) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            int noCars = arr.length;
            
            for(int i=0; i<len; i++)
                arr[i] = sc.nextInt();
            
            for(int i=1; i<len; i++) {
                if(arr[i] > arr[i-1]) {
                    arr[i] = arr[i-1];
                    noCars--;
                }
            }
            System.out.println(noCars);
        }

    }
}
