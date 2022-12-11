public class arraysLinearSerch {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        int[] arr={1,-3,-4,-2,1,3,5,7,8,9,6,4,6,8,7,7,4,-1,1,4,-6,5,4,3,3,4,6,7,8,8,5};
        int element=6;
        //find elment in given array print fist index and last index
        int fistElement=0,lastElement=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
            fistElement=i;
            break;
            }
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==element){
                    lastElement=i;
                }
            
        }
        System.out.print(fistElement+" "+lastElement);
    }
}
