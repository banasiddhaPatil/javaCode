public class bubbleSort {
    public static void main(String[] arg){
        int[] arr={2,6,4,6,8,9,8,7,6,5,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        
    }
}
