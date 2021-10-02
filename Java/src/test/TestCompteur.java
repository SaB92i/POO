package test;
import compteurs.Compteur;
public class TestCompteur{
    public static void main(String[]args){
        Compteur c1= new Compteur(7);
        System.out.println(c1);
        for (int i=0;i<10;i++){
            c1.incrementer();
            System.out.println(c1);
        }
        for (int i=0;i<20;i++){
            c1.decrementer();
            System.out.println(c1);
        }
    }
}
