package com.shah.mylearn.ch01;

public class SortMain
{
    public static void main( String[] args )
    {
        //System.out.print( 7/3.0 );
        Object O = new int[1];
        O = 3;
        System.out.println(O instanceof String);
        System.out.print( "************" );

        int[] primes= new int[]{2,3,4,5,6,7};
        for( int n : primes) {
            System.out.println(n);
        }

        //How to declare array of Strings
//        final Sort sorter= new Sort();
//        var actualname = new String[]{ "Shahinshah", "Samih", "Anthony", "Dicosta","Frederic", "Marcus"};
//        sorter.sort(actualname);
//        //Sort.sort(actualname);
//        for(String name : actualname){
//            System.out.println(name);
//        }
//        System.out.println( "The End" );


    }
}
