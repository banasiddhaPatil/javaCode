public class firstOcc {
    public static void main(String[] args){
        int[] arr={1,3,1,4,2,1,6,8,9,6,5,4,4,3,4,5,2};
        int n=0;
        int target=2;
        int ans=findFirstOcc(arr,n,target);
        System.out.print(ans);
    }
    public static int findFirstOcc(int[] arr,int n,int target){
        int length=arr.length;
        if(n==length)
        return -1;

        if(arr[n]==target)
        return n;

        int temp = findFirstOcc(arr,n+1,target);
        return temp;
    }
}
