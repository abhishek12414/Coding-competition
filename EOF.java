/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author Abhi
 */
import java.util.Scanner;

public class EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int line = 0;
        
        while(sc.hasNext()) {
            System.out.println(++line + " " +sc.nextLine());
        }
    }
}