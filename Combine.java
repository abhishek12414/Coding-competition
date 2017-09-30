/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class Combine {

    public static void display(ArrayList<String> al) {
        System.out.print("List Items : ");
        for (String name : al) {
            System.out.print(name + "   ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        al.add("hemanth");
        al.add("mahesh");
        al.add("nani");
        al.add("ramya");
        al.add("gowthami");
        al.add("nikhil");
        al.add("a");
        al.add("b");

        //display items
        display(al);

        //remove all items
        while(!al.isEmpty())
            System.out.println("Removed Item : " + al.remove(0));
        //display items
        display(al);
        
        //infinite loop
//        while (true) {
//            
//            //condition for break
//            if (al.isEmpty()) {
//                System.out.println("\nNo item in list");
//                return;
//            }
//            
//            //call display() method to display the items
//            display(al);
//            
//            //read input for delete item from user
//            System.out.print("\nenter the name to remove : ");
//            String name = sc.nextLine();
//
//            //if item is there then delete otherwise not found message
//            if (al.remove(name)) {
//                System.out.println("removed element is :  " + name);
//            } else {
//                System.out.println("Name not found");
//            }
//        }
    }
}
