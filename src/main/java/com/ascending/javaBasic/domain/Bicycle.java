package com.ascending.javaBasic.domain;

public class Bicycle extends Bike {
    public Integer handleNum;
    public Integer pedalNum;
    public String brandName;
    public String color;
    public Integer weight;
    public double price;

    public Bicycle (){}
    public Bicycle (int handleNum, int pedalNum, String brandName, String color, int weight, double price) {
        this.brandName = brandName;
        this.pedalNum = pedalNum;
        this.handleNum = handleNum;
        this.color = color;
        this.weight = weight;
        this.price = price;


    }
    public int gethandleNum (){
        return handleNum;
    }
    public int getpedalNum(){
        return pedalNum;
    }
    public String getbrandName (){
        return brandName;
    }
    public String getColor (){
        return color;
    }
    public Integer getweight (){
        return weight;
    }
    public double getprice (){
        return price;
    }


    public static void main (String[] arg) {
        Bicycle baby=new Bicycle(2,4,"Giant","red",50,500);
        System.out.println(baby.handleNum);
        System.out.println(baby.pedalNum );
        System.out.println(baby.brandName);
        System.out.println(baby.color);
        System.out.println(baby.weight );
        System.out.println(baby.price);

    }

}