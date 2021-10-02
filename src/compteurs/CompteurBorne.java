package compteurs;
public class CompteurBorne extends Compteur{
     private int max;
    public CompteurBorne(int max){
    	super();
        setMax(max);
    }
    public CompteurBorne(int max, int valeur){
    super(valeur);
    setMax(max);
    }
    public void incrementer(){
    if (getVal()<max){
        super.incrementer();
        }
    }
    public int getMax(){
    return max;
    }
    public void setMax(int max){
        this.max=max;
        }
    public String toString(){
    return "[Le compteur est a : " + getVal() + "]";
    }
}

