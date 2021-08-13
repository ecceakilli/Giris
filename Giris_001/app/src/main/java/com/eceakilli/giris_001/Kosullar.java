package com.eceakilli.giris_001;

public class Kosullar {
    public static void main(String[] args){
        //For döngüsü
        int[] numbers={1,2,3,4,5,6,7,8,9,};

        for (int i =0; i< numbers.length; i++){

            int x=numbers[i]*5;
           // System.out.println(x);
        }
        //dizideki elemanları tek tek yazdım
        for (int number:numbers){
          //  System.out.println(number);
    }
        //while döngüsü
        int b=0;
        while (b>10){
            System.out.println("ece");
            b++;
        }


    }
}
