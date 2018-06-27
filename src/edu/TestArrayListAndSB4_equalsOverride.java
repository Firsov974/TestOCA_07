package edu;

import java.util.ArrayList;

class MyPers {
    String name;
    MyPers(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof MyPers){
            MyPers p = (MyPers)obj;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        } else
            return false;
    }
}

public class TestArrayListAndSB4_equalsOverride {
    public static void main(String[] args) {
        ArrayList<MyPers> myArrList =
                new ArrayList<MyPers>();
        MyPers p1 = new MyPers("Shreya");
        MyPers p2 = new MyPers("Paul");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p2);
        System.out.println(myArrList.contains(new MyPers("Shreya")));
        System.out.println(myArrList.contains(p1));
        System.out.println(myArrList.indexOf(new MyPers("Paul")));
        System.out.println(myArrList.indexOf(p2));
        System.out.println(myArrList.lastIndexOf(new MyPers("Paul")));
        System.out.println(myArrList.lastIndexOf(p2));
    }
}
