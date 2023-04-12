 class ByteToall {
    
    public static void main(String[] args) {
        
        Short  s= 10;
        Short t = new Short(s);

        Byte b = t.byteValue();
        System.out.println(b);

        short p= t.shortValue();
        System.out.println(p);

        int i= t.intValue();
        System.out.println(i);

        long l=t.longValue();
        System.out.println(l);

        float f= t.floatValue();
        System.out.println(f);

        Double d= t.doubleValue();
        System.out.println(d);
    }
}
