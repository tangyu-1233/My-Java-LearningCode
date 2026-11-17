package com.yu.extendstest4;

public class Phone extends SmartDevice{
    @Override
    public double getPrice() {
            return super.getPrice() * 0.9;
    }
}
