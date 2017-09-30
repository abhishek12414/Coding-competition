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
public class CarsSpeed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read test cases
        int N = sc.nextInt();
        //store no of cars that can move faster
        int moveablecars;
        
        //loop up to test case
        for (int i = 0; i < N; i++) {
            //at the begining set moveable cars to 0
            moveablecars = 0;
            
            //read no of cars
            int cars = sc.nextInt();
            //array for store cars speed
            int[] carsSpeed = new int[cars];
            //first cars always move with its maximum speed
            moveablecars++;
            //for back cars set minspeed to zero
            int minSpeed = 0;
            //loop upto remaining cars and their speed
            for (int j = 0; j < cars; j++) {
                //read individual cars speed
                carsSpeed[j] = sc.nextInt();
                //at the begining
                if (j == 0) {
                    //set minspeed to first car speed
                    minSpeed = carsSpeed[j];
                } else {
                    //now check if the minspeed is greater than current car speed
                    //then set minspeed to current car speed and increment
                    //moveable cars.
                    if (minSpeed > carsSpeed[j]) {
                        minSpeed = carsSpeed[j];
                        moveablecars++;
                    }
                }
            }
            //display the no of moveable cars
            System.out.println(moveablecars);
        }
    }
}
