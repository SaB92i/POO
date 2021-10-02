package test;
import geometrie.Segment;

public class TestSegment {

    public static void main(String[] args) {
        Segment s1 = new Segment(1,2,2,3);
        System.out.println(s1);
        s1.translator(5,4);
        System.out.println(s1);

    }

}