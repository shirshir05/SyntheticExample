package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        switch (x % 2){
            case 0:
                x += 1;
                break;
            default:
                x += 2;
        }
    }
}
