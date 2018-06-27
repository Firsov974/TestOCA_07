package edu;

public class TestArrays01 {

    public static void main(String[] args) {
	    int intArray[]; // array declaration
        intArray = new int[2]; //array allocation
        for(int i=0; i<intArray.length; i++){
            intArray[i] = i+5; // initializung array
        }
        System.out.println("After first initialization:" + intArray[0] + " " + intArray[1]);
        intArray[0] = 10;
        intArray[1] = 1870;

        String[] strArray;
        strArray = new String[4];
        for(int i=0; i<strArray.length; i++){
            strArray[i] = new String("Hello " + i); // initializung array
        }
        System.out.println("String array:" + strArray[0] + " " + strArray[1]+ " " + strArray[2]+ " " + strArray[3]);

        int[] multiArr[];
        multiArr = new int[2][3];
        for(int i=0; i<multiArr.length; i++){
            for(int j=0; j<multiArr[i].length; j++) {
                multiArr[i][j] = i*10 + j; // initializung array}
                System.out.print(" Multi array element:" + multiArr[i][j]);
            }
            System.out.println("");
        }


    }
}
