import java.util.Scanner;



public class factorial {
    public static double fact(int n)
    {
         if(n==0)    {
            return 1;
         }
         else{
            return n*fact(n-1);
         }
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number to calculate factorial:");
    int number=scanner.nextInt();
    scanner.close();
    System.out.println("factorial of "+number+" is "+fact(number));
    }
}
