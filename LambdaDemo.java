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

interface Addable {
    int add(int a, int b);
}

public class LambdaDemo {

    public static void main(String[] args) {
                
        Addable aa=(a,b)->(a+b);
        System.out.println(aa.add(6,6));
        
        Addable ab =(a,b)->{return (a+b);};
        System.out.println(ab.add(1,8));
    }
}
