package PRAKTIK.w6.Exercise2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Shape s2 = new Shape("red", false);
        System.out.println(s2.toString());
    }
}