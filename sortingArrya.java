import java.util.Scanner;
public class sortingArrya {
    /**
     * @param Arg
     */
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        final int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int tem=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                }
            } 
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
