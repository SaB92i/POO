package geometrie;


public class Segment{
    private Point a;
    private Point b;

    public Segment(Point a,Point b){
        this.a=a;
        this.b=b;
    }
    public Segment(int xa,int ya,int xb,int yb){
        a = new Point(xa,ya);
        b = new Point(xb,yb);
    }


    public void translator(int dx, int dy){
        a.translator(dx, dy);
        b.translator(dx, dy);
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }



    @Override
    public String toString() {
        return "Segment{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
