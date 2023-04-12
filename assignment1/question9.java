class question9{
    public static void main(String[] args){
        Byte a=new Byte((byte)10);
        byte b=Byte.valueOf(a);
        System.out.println(b);

        short c=a.shortValue();
        System.out.println(c);

        int d=Byte.toUnsignedInt(a);
        System.out.println(d);

        long e=Byte.toUnsignedLong(a);
        System.out.println(e);

        float f=a.floatValue();
        System.out.println(f);

        double g=a.doubleValue();
        System.out.println(g);

    }
}