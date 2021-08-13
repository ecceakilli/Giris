package com.eceakilli.giris_001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays  {
    public static void  main(String[] args){
        //Dizi yolları

        //tek tek yazdırma
        String[] myStringArray=new String[3];
        myStringArray[0]="ece";
        myStringArray[1]="akıllı";
        myStringArray[2]="arıöz";
        System.out.println(myStringArray[2]);

        //int değer
        int[] myIntegerArray=new int[3];
        myIntegerArray[0]=8;
        myIntegerArray[1]=6;
        myIntegerArray[2]=51;
        System.out.println(myIntegerArray[2]);

        //dizinin elemanlarını tekte yazmak

        int[] myNumberArray={1,2,3,4,5,6};
        System.out.println(myNumberArray[3]);

        //ArrayList
        ArrayList<String> myMusicians=new ArrayList<String>();
        myMusicians.add("ece");
        myMusicians.add("mehmet");
        myMusicians.add("arıöz");
        System.out.println(myMusicians.get(0));

        //Set
        //sette elemanı 1 tane olark göreceksin.
        HashSet<String> mySet=new HashSet<>();

        mySet.add("Ece");
        mySet.add("Ece");
        System.out.println(mySet.size());

        //HashMap Anahtar verip cevabını alıyorsun
        //kosmak 100 kalori olarak gelecek çıktı 100 olacak
        HashMap<String,Integer> myHashMap=new HashMap<>();
        myHashMap.put("run",100);
        myHashMap.put("walk",50);

        System.out.println(myHashMap.get("run"));


    }
}
