package edu;

import java.util.ArrayList;

public class TestArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("one");
        myArrList.add("two");
        myArrList.add("three");
        myArrList.set(1, "One and Half");
        for(String element: myArrList){
            System.out.println(element);
        }

    }
}
