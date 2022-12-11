import java.util.Scanner;
public class fibonachiSeries {
    public static void main(String[] arg){
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter n Number :");
        final int n=sc.nextInt();
        sc.close();
        int a=0,b=1;
        if(n>=0)
        System.out.print("0 ");
        if(n>0)
        System.out.print("1 ");
        for(int i=0;i<n-2;i++){
              int count=a+b;
              a=b;
              b=count;
              System.out.print(count+" ");
        }
        
        
        
    }
}
