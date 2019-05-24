package com.ascending.javaBasic.domain;

public class Bike {
    public String wheelShape = "round";
    public Integer wheelNumber =2;
    public String seatShape = "square";

    public Bike () {}

    public Bike (String wheelShape, String seatShape,int wheelNumber){
       this.wheelShape = wheelShape;
       this.seatShape = seatShape;
       this.wheelNumber = wheelNumber;

    }


    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public String getSeatShape (){
        return seatShape;
    }
    public String getWheelShape(){
        return wheelShape;
    }

    public static void main (String[] arg){
        Bike b=new Bike();
        Bicycle b2 = new Bicycle(3, 7, "Giant", "red",50,200.99);
        Bicycle b3 = new Bicycle (4,2,"bobo","blue",60,100.55);
        Bicycle b4 = new Bicycle (12,4,"Alex leanrs to Bike","Green",25,60);
        System.out.println("The Shape is " + " " + b.getWheelShape() + ".");
        System.out.println("The wheel Number is" + " " + b.getWheelNumber()+ ".");
        System.out.println ("The seat shape is" + " " + b.getSeatShape()+ ".");

        System.out.println("The handle number is" + " " + b2.gethandleNum()+ ".");
        System.out.println("The pedal number is" + " " + b2.getpedalNum()+ ".");
        System.out.println ("The brand name is" + " " +b2.getbrandName()+ ".");
        System.out.println ("The color is" + " " +b2.getColor()+ ".");
        System.out.println ("The weight is" + " " +b2.getweight()+ ".");
        System.out.println ("The price is" + " " +b2.getprice()+ ".");
        System.out.println(b3.gethandleNum()+ ".");
        System.out.println(b3.getpedalNum()+ ".");
        System.out.println (b3.getbrandName()+ ".");
        System.out.println (b3.getColor()+ ".");
        System.out.println (b3.getweight()+ ".");
        System.out.println (b3.getprice()+ ".");

        System.out.println("The handle number is" + " " + b3.gethandleNum()+ ".");
        System.out.println("The pedal number is" + " " + b3.getpedalNum()+ ".");
        System.out.println ("The brand name is" + " " +b3.getbrandName()+ ".");
        System.out.println ("The color is" + " " +b3.getColor()+ ".");
        System.out.println ("The weight is" + " " +b3.getweight()+ ".");
        System.out.println ("The price is" + " " +b3.getprice()+ ".");

        System.out.println("The handle number is" + " " + b4.gethandleNum()+ ".");
        System.out.println("The pedal number is" + " " + b4.getpedalNum()+ ".");
        System.out.println ("The brand name is" + " " +b4.getbrandName()+ ".");
        System.out.println ("The color is" + " " +b4.getColor()+ ".");
        System.out.println ("The weight is" + " " +b4.getweight()+ ".");
        System.out.println ("The price is" + " " +b4.getprice()+ ".");

    }

}