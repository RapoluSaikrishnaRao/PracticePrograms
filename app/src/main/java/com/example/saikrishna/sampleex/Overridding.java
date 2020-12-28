package com.example.saikrishna.sampleex;


class A {
    A() {
        System.out.println("this is My Company A constructor");
    }

    public void myCompany() {
        System.out.println("this is My Company Method");
    }
}

class B extends A {
    B() {
        //super.myCompany();
        super();
        System.out.println("this is My Company B constructor");
    }

    public void myCompany() {
        super.myCompany();
        System.out.println("this is My Company B Method");
    }
}

public class Overridding {
    public static void main(String args[]) {
        B b = new B();
        b.myCompany();
    }
}
