public class ArryFindTarget {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        int[] arr={8,7,6,5,1,2,3};
        int target=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            System.out.println(i);
        }
    }
    
}
