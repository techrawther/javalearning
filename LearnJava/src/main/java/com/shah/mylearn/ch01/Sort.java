package com.shah.mylearn.ch01;



public class Sort {
    //public static void sort(String[] names){
    public void sort(String[] names){

        var n = names.length;
        while (n > 1){
            for(var j=0;j < n-1; j++){
                if (names[j].compareTo(names[j+1]) > 0 ){
                    var temp = names[j+1];
                    names[j+1]=names[j];
                    names[j]=temp;
                }
            }
           n--;
        }

    }

}
