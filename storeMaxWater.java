
public class storeMaxWater {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int start=0,end=arr.length-1;
        int maxStart=0,maxEnd=0;
        int water=0;
        while(start<=end){
            maxStart=Math.max(maxStart,arr[start]);
            maxEnd=Math.max(maxEnd,arr[end]);
            if(maxStart<=maxEnd)
              water+=maxStart-arr[start++];
           else 
              water+=maxEnd-arr[end--];
              
              
        }
        System.out.print(water);
    }
    
}
