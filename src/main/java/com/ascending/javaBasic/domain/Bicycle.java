package com.ascending.javaBasic.domain;

public class Bicycle extends Bike {
    public Integer handleNum;
    public Integer pedalNum;
    public String brandName;

    public Bicycle (){}
    public Bicycle (int handleNum, int pedalNum, String brandName) {
        this.brandName = brandName;
        this.pedalNum = pedalNum;
        this.handleNum = handleNum;
    }



    public static void main (String[] arg) {
        Bicycle baby=new Bicycle(2,4,"Giant");
        System.out.println(baby.handleNum);
        System.out.println(baby.pedalNum );
        System.out.println(baby.brandName);

    }

}