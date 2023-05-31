import java.util.Scanner;
public class testcalculator {
    public static void main(String[] args)
    {
Scanner Sc=new Scanner(System.in);
System.out.println("enter the operation you want to perform");
System.out.println("enter 1 to add the numbers ");
System.out.println("enter 2 to subtract the numbers ");
System.out.println("enter 3 to multiply numbers ");
System.out.println("enter 4 to divide the numbers ");
System.out.println("enter 5 to find the power of the numbers ");
System.out.println("enter 6 to calculate the log of the number ");
System.out.println("enter 7 to calculate the sin of the number ");
System.out.println("enter 8 to calculate the cos of the number ");
System.out.println("enter 9 to calculate the tan of the number ");
System.out.println("enter 10 to calculate the square root of the number ");
System.out.println("enter 11 to calculate the absolute value of the number ");
System.out.println("enter 12 to calculate the sin inverse of the number ");
System.out.println("enter 13 to calculate the cos inverse value of the number ");
System.out.println("enter 14 to calculate the tan inverse value of the number ");
System.out.println("enter 15 to calculate the ln of the number ");
int d=Sc.nextInt();
if(d>=6)
{
    double b=0;
    System.out.println("please enter the number");
    double a=Sc.nextDouble();
    calculator c=new calculator(a,b,d);
    System.out.print(c.calculate());
}
else {
    System.out.println("please enter the numbers");
    double a=Sc.nextDouble();
    double b=Sc.nextDouble();
    calculator c=new calculator(a,b,d);
    System.out.print(c.calculate());
     }
Sc.close();
    }
}
