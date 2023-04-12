import javax.swing.event.SwingPropertyChangeSupport;

class FTOH {
 /*public static void main(String[] args) {
    
    float f= 736.43f;

    String str= Float.toHexString( f);
     System.out.println(str);
}*/

public static void main(String[] args) {
    

Double Value= 7645236.2376;
 String str = Double.toHexString(Value);
 System.out.println(str);

 long low= Double.doubleToLongBits( Value);
 System.out.println(low);

}

}
