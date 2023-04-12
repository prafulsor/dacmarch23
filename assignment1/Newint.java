class Newint{
 
    public static void main(String[] args) {
        int z= 10;

        Integer a= new Integer(z);

        Byte b = a.byteValue();
        System.out.println(b);
        
         Short c= a.shortValue();
         System.out.println(c);

         int h= a.intValue();
         System.out.println(h);

         long l= a.longValue();
         System.out.println(l);

         float f= a.floatValue();
         System.out.println(f);

         double d= a.doubleValue();
         System.out.println(d);
    }

}


