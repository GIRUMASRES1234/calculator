import java.util.Scanner;
public class project2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x;
                double y;
        System.out.println("enter the value for x and y");
         x=sc.nextDouble();
        System.out.println("enter the operator");
        char Operator=sc.next().charAt(0);

        y=sc.nextDouble();

         double result=0;
         switch(Operator){
            case '+' -> result=x+y;
            case '-' -> result=x-y;
            case '*' -> result=x*y;
            case '/' -> result=x/y;


        } System.out.println(result);

    }
}
