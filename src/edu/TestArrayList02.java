package edu;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("one");
        myArrList.add("two");
        myArrList.add("four");
        myArrList.add(2, "three");
        ListIterator<String> iterator = myArrList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
