package edu;

public class TestArrayInterface {
    public static void main(String[] args) {
        MyInterface[] interfaceArr = new MyInterface[]{
                new MyClass1(),
                null,
                new MyClass2()
        };
        System.out.println(interfaceArr[0] + " " + interfaceArr[2]);
    }
}

interface MyInterface{}
class MyClass1 implements MyInterface{}
class MyClass2 implements MyInterface{}

