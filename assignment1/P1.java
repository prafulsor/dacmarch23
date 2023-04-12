class p1{
     public static void main(String[] args) {
        
     byte value=123;
      String str= Byte.toString(value);
      System.out.println("byte value into string is :"+str);
      

      //byte value to byte instance
        byte a=6;
        Byte b=new Byte(a);
        System.out.println(b);

    
         String a=new String("126");
         //Byte b=Byte.valueOf(a);
         Byte c=Byte.parseByte(a);
         System.out.println(c); 
            }
        }
    