package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.92);
        Customer anotherCustomer;
        anotherCustomer = customer; // point to the customer(Customer)
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // insert number 2 into position 1

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }


        LinkedList<String> object = new LinkedList<String>();
        object.addFirst("A");
        object.add(1, "B");
        object.add("B");
        object.


    }


}
