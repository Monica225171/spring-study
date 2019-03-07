package com.spring.IoC;
//待测程序
public class Max {
    private int a;
    private int b;
    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }
public int getMax(){
        return a>b?a:b;
}


}
