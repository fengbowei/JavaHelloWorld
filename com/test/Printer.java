package com.test;

import com.test.Printable;

public class Printer
{
    public static void print(Object obj)
    {
        System.out.println(((Printable)obj).getString());
    }
}

