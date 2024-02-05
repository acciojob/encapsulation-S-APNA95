package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("Sana");
        String ans = rwOnly.getName();
        System.out.println(ans);
    }
}