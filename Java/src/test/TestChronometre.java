package test;

import compteurs.Chronometer;

public class TestChronometre {
    public static void main(String[]args){
        Chronometer c1 = new Chronometer(0,50,0);
        for(int i = 1; i<500; i++) {
            c1.incrementer();
            System.out.println(c1);
        }
    }
}
