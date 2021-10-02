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
    public void translator(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
