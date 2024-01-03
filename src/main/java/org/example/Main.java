package org.example;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int res = calculator.add(2,3);
        char io = calculator.invalidIO('s','v');
        System.out.println(res);
        System.out.println(io);
    }
}
