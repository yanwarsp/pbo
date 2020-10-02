package com.pboreg;

public class LoopingBersarang {

    public static void main(String[] args) {

        // looping bersarang


        // kotak
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga dari bintang sedikit ke banyak
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga dari bintang banyak ke sedikit
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga dari bintang (membentuk setengah wajik)
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }

    }
}
