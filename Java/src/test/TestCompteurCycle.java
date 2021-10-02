package test;
import compteurs.CompteurCycle;
public class TestCompteurCycle{
    public static void main(String[]args){
        CompteurCycle cc1= new CompteurCycle(70,5);
        System.out.println(cc1);
        for(int i=0; i<10; i++){
            cc1.incrementer();
            System.out.println(cc1);
        }
        for(int i=0;i<20;i++){
            cc1.decrementer();
            System.out.println(cc1);
        }
    }
}
