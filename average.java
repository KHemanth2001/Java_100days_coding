import java.util.*;
public class average {
    public static int average(int a,int b,int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the average is: "+average(a,b,c));
    }
}
