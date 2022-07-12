package com.company;

public class Class {
    private int  number;
    private String  word;
    private int [] arrey;


    public Class(){

    }

    public Class(int number, String word, int [ ] arrey){
        this.number = number;
        this.word = word;
        for (int a: arrey) {
            System.out.println(a);

        }


    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArrey() {
        return arrey;
    }

    public void setArrey(int[] arrey) {
        this.arrey = arrey;
    }
}
