import java.util.Scanner;
class Parsing1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= Integer.parseInt(args[0]);
     float num2=Float.parseFloat(args[1]);
        double num3=Double.parseDouble(args[2]);

        System.out.println("choose what you want to do");
        System.out.println("1 for addition 2 for multiplication 3 for subtract 4 for division");
        int choice = sc.nextInt();

        switch(choice ){
               case 1:{
                double sum = num1+num2+num3;
                System.out.println("sum is :" + sum);
                break;
            }

            case 2:{
                double mul= num1*num2*num3;
                System.out.println("multiplication is :" + mul);
                break;
            }
            case 3:{
                double sub= num1-num2-num3;
                System.out.println("subtraction  is :" + sub);
                break;
            }
            case 4:{
                double dive= num1/num2/num3;
                System.out.println("division is :" + dive);
                break;
            }

            default: 
            System.out.println("Wrong input");

        }
    }
    
        
}
