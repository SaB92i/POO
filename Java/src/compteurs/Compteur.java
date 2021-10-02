package compteurs;
public class Compteur{
    private int valeur;

    public Compteur(){
        valeur=0;
    }
    public Compteur(int valeur){
        setVal(valeur);
    }
    public void incrementer(){
        valeur=valeur+1;
    }
    public void decrementer(){
        if (valeur>0){
            valeur=valeur-1;
        }
    }
    public int getVal(){
        return valeur;
    }
    public void setVal(int valeur){
        this.valeur=valeur;
    }
    public String toString(){
        return "[Le compteur est a : " + valeur + "]";
    }

}