package geometrie;
public class PointColore extends Point {
    private String couleur;
    public PointColore() {
        super();
        couleur ="blanc";
    }
    public PointColore(int abs, int ord) {
        super(abs, ord);
        couleur ="blanc";
        }
    public PointColore(int abs, int ord,String col) {
        super(abs, ord);
        setCouleur(col);
    }
    public void afficher() {
        super.afficher();
        System.out.println(" >>> et de couleur : " + couleur );
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String col){
            couleur = col;
    }
    public String toString() {
        return "[La couleur est " + couleur + "]";
    }
}
