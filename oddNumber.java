import java.util.Scanner;
public class oddNumber {
    /**
     * @param args
     */
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    
}
