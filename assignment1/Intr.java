import java.io.StringBufferInputStream;

class Intr {
    public static void main(String[] args) {
        
        int A= 1262;

        String Value = Integer.toHexString(A);
        System.out.println(Value);
    
        String Value2 = Integer.toBinaryString(A);
        System.out.println(Value2);

        String Value3= Integer.toOctalString(A);
        System.out.println(Value3);
    }
    
}
