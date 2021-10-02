package compteurs;
public class CompteurCycle extends CompteurBorne{
    public CompteurCycle(int max){
        super(max);
    }
    public CompteurCycle(int max,int valeur){
        super(max,valeur);
    }
    
    public void incrementer(){
        if(getMax() > getVal()){
            super.incrementer();
            if(getMax()==getVal()) {
            	setVal(0);
            }
        }
    }
    public void decrementer(){
        if(getVal()>=0){
            setVal(getVal()-1);
            if(getVal()==-1) {
            	setVal(getMax()-1);
            }
        }
    }
    public String toString(){
       return super.toString();
    }

}
