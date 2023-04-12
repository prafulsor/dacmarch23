import java.util.Scanner;
class Q18{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a= sc.nextInt();
        int b=sc.nextInt();

     int value=   Integer.valueOf(a).compareTo(Integer.valueOf(b));
  if (value == -1)
  System.out.println(a +" is minimum number " + b +" is maximum number");
  else
  System.out.println(a +" is maximum number " + b +" is minimum number");

  
    }
}