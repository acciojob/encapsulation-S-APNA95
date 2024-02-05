package com.driver.encapsulation;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("Sapna");
        String ans = rwOnly.getName();
        System.out.println(ans);
    }
}