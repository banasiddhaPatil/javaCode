import java.util.Scanner;
public class palimdrom {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String");
        String str=sc.nextLine();
        sc.close();
        int n=str.length();
        ispelimdrom(str,n);
    }
    /**
     * @param str
     * @param n
     */
    public static void ispelimdrom(String str,int n){
        int li=0,ri=n-1;
        int count=0;
        while(li<ri){
            if(str.charAt(li)==str.charAt(ri)){
                li++;
                ri--;
            }
            else{
                count=1;
            }
        }
        System.out.print(count==0);
    }
}
