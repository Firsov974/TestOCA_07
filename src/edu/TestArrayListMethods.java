package edu;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("One");
        myArrList.add("Two");
        String valFromList = myArrList.get(1);
        System.out.println(valFromList);
        System.out.println(myArrList.size());

    }

}
