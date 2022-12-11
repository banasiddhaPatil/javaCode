import java.util.Arrays;
public class separeteEvenAndOdd {
    public static void main(String[] arg){

        int[] arr={3,1,4,6,7,8,6,5,4,6,7,8,9};
        Arrays.sort(arr);
        araysEvenAndOdd(arr);

    }
        public static void araysEvenAndOdd(int[] arr){
            int[] brr=new int[arr.length];
            int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    brr[index]=arr[i];
                    index++;
                }
            }
                for(int i=0;i<arr.length;i++){
                    if(arr[i]%2!=0){
                        brr[index]=arr[i];
                        index++;
                    }
                }
                for(int i=0;i<brr.length;i++){
                    System.out.print(brr[i]+" ");
                }
            }
        
       
    
    
}
