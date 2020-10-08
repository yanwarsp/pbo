package com.pboreg;

public class Main {

    public static void main(String[] args) {

        // code here CANNOT use x

        { // this is a block

            // code here CANNOT use x

            int x = 100;

            //code here CAN use x
            System.out.println(x);

        } // the block ends here

        // code here CANNOT use x
    }
}
