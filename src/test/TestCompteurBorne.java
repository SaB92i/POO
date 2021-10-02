package test;
import compteurs.CompteurBorne;
public class TestCompteurBorne{
    public static void main(String[]args){
        CompteurBorne cb1= new CompteurBorne(5);
        System.out.println(cb1);
        for (int i=0;i<6;i++){
            cb1.incrementer();
            System.out.println(cb1);
        }

    }
}
