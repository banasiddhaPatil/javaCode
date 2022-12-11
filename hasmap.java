import java.util.HashMap;

public class hasmap {
   
    /**
     * @param arg
     */
    public static void main(String[] arg){
        String s="my self bansiddha patil .I am from solaput maharashtra";
        int n=s.length();
         HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                freq++;
                hm.put(ch,freq);
            }
            else{
                hm.put(ch,1);
            }
        }

        }
        System.out.print(hm);

    }
    
    }

