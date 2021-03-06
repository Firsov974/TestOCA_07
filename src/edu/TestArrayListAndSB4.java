package edu;

import java.util.ArrayList;

public class TestArrayListAndSB4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrList =
                new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb2);
        System.out.println(myArrList.contains(new StringBuilder("Jan")));
        System.out.println(myArrList.contains(sb1));
        System.out.println(myArrList.indexOf(new StringBuilder("Feb")));
        System.out.println(myArrList.indexOf(sb2));
        System.out.println(myArrList.lastIndexOf(new StringBuilder("Feb")));
        System.out.println(myArrList.lastIndexOf(sb2));
    }
}
