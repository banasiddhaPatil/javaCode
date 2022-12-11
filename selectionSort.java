public class selectionSort {
    public static void main(String[] arg){
        int[] arr={1,9,2,8,3,7,4,5,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=tem;
            System.out.print(arr[i]+" ");
        }
    }
}
