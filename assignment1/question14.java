class question9{
    public static void main(String[] args){
        Short a=new Short((short)10);
        Short b=Short.valueOf(a);
        System.out.println(b);

        byte c=a.byteValue();
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