package com.ascending.javaBasic.domain;

public class Bicycle extends Bike {
    public Integer handleNum =2;
    public Integer pedalNum =2;
    public String brandName= "Giant";

    public Bicycle (){}

    public Integer getHandleNum() {
        return handleNum;
    }
    public Integer getPedalNum(){
        return pedalNum;

    }
    public String getbrandName(){
        return brandName;
    }

    public static void main (String[] arg) {
        Bicycle baby=new Bicycle();
        System.out.println(baby.getHandleNum());
        System.out.println(baby.getPedalNum());
        System.out.println(baby.getbrandName());

    }

}