package geometrie;
public class Point {
    int x;
    int y;
    public Point(){
    }
    public Point(int abs, int ord) {
        x=abs;
        y=ord;
    }
    public void afficher(){
    System.out.println("J'ai pour abscisse :"+ x + " et pour ordonnee : " + y);

    }


}
