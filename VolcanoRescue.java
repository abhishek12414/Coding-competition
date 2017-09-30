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
public class VolcanoRescue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read dimension
        int dimension = sc.nextInt();
        int[][] area = new int[dimension][dimension];
        int[][] resultant = new int[dimension][dimension];
        
        //read active no of area
        int activeArea = sc.nextInt();
        
        //read cordinates
        int x_cordinate, y_cordinate;
        //read the power
        int power;        
        
        
        while(activeArea-- >0) {
            x_cordinate = sc.nextInt();
            y_cordinate = sc.nextInt();
            power = sc.nextInt();
            for(int i=0; i<dimension; i++) {
                for(int j=0; j<dimension; j++) {
                    //TODO
                    int rowDiff = Math.abs(x_cordinate - i);
                    int colDiff = Math.abs(y_cordinate - j);
                    int max = Math.max(rowDiff, colDiff);
                    int res = power - max;
                    area[i][j] = res > 0 ? res : 0;
                }
            }
            //for display testing purpose
//            System.out.println("\n intermediate result \n");
//            for(int i=0; i<dimension; i++) {
//                for(int j=0; j<dimension; j++) {
//                    //TODO
//                    System.out.print(area[i][j] + "  ");
//                }
//                System.out.println("");
//            }
        
            for(int i=0; i<dimension; i++) {
                for(int j=0; j<dimension; j++) {
                    //TODO
                    resultant[i][j] += area[i][j];
                }
            }
        }
        
        //for display testing purpose
//        System.out.println("\n\n Result \n");
//        for(int i=0; i<dimension; i++) {
//            for(int j=0; j<dimension; j++) {
//                //TODO
//                System.out.print(resultant[i][j] + "  ");
//            }
//            System.out.println("");
//        }

        int result = 0;
        for(int[] a : resultant) {
            for(int x : a) {
                if(x > result) {
                    result = x ;
//                    System.out.print(" --> "+x);
                }
            }
        }
        
        System.out.println(result);
    }
}
