package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly obj = new RWOnly();

        //as privste variable
//        obj.name = "Siddhi";
//         System.out.println(obj.getName());

        obj.setName("Siddhi");
        System.out.println(obj.getName());
    }
}