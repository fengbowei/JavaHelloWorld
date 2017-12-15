package com.test;

public class Lib
{
    private String s;
    public Lib()
    {
        s = new String("Hello World From Lib!\n");
    }
    
    public void sayHello()
    {
        System.out.println(s);
    }
}
