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

public class StaticDemo {

    public static int B=0, H=0;
    public static boolean flag=false;
    
    static {     
        try {                    
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            if( B <= 0 || H <=0 ) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } else
                flag = true;
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
