package com.ascending.javaBasic.domain;

public class Bike {
    public String wheelShape = "round";
    public Integer wheelNumber =2;
    public String seatShape = "square";

    public Bike () {}

    public String getWheelShape (){
        return wheelShape;
    }

    public Integer getWheelNumber(){
        return wheelNumber;
    }

    public String getSeatShape (){
        return seatShape;
    }

    public static void main (String[] arg){
        Bike b=new Bike();
        System.out.println(b.getWheelShape());
        System.out.println(b.getWheelNumber());
        System.out.println (b.getSeatShape());
    }
}