package PRAKTIK.w2.no4;

public class ConvertDataTypes {
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
