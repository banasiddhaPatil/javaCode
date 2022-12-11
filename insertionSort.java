public class insertionSort {
    public static void main(String[] arg){
    int[] arr={1,4,7,9,3,5,7,9,2,34,445,6,77,88,9};
    int n=arr.length;
    
for(int i=0;i<n;i++){
    int current=arr[i];
    int j=i-1;
    while(j>=0 && current<arr[j]){
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=current;
}
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
    }
}
