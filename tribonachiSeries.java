import java.util.Scanner;
public class tribonachiSeries {
    /**
     * @param arg
     */
    public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n number:");
    int n=sc.nextInt();
    sc.close();
    int a=0,b=0,c=1;
    if(n>=0)
    System.out.print(a+" ");
    if(n>0)
    System.out.print(b+" ");
    if(n>0)
    System.out.print(c+" ");
    for(int i=0;i<n-3;i++){
        int out=a+b+c;
        a=b;
        b=c;
        c=out;
        System.out.print(out+" ");
    }
    }
}
