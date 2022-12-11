 import java.util.*;
 public class kps{
    public static void main(String[] args){
        String str="12";
        System.out.print(printKPS(str));
    }
    public static ArrayList<String> printKPS(String str){
        // base conditions
        if(str.length()==0){
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }

        char ch=str.charAt(0);
        String remstr=str.substring(1);
        ArrayList<String> list=printKPS(remstr);
        ArrayList<String> ans=new ArrayList<>();
        String s=choisechar(ch);
        for(String val:list){
            for(int i=0;i<s.length();i++){
                String sum=s.charAt(i)+val;
                ans.add(sum);
            }
        }
        return ans;

    }
    public static String choisechar(char ch){
        if(ch=='1')
        return "abc";
        else if(ch=='2')
        return "def";
        else if(ch=='3')
        return "ghi";
        else if(ch=='4')
        return "gkl";
        else if(ch=='5')
        return "mno";
        else if(ch=='6')
        return "pqr";
        else if(ch=='7')
        return "stu";
        else if(ch=='8')
        return "vwx";
        else if(ch=='9')
        return "yz";
        else return "";
    }
}