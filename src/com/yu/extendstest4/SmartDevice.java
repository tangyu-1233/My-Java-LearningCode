package com.yu.extendstest4;

public class SmartDevice {
    String name;
    double price;

    public double getPrice(){
        if(price >= 0 && price < 1000){
            return price;
        }else if(price < 5000){
            return price * 0.9;
        }else if(price < 10000){
            return price * 0.8;
        }else{
            return price * 0.7;
        }
    }
}
