package string1;

public class lastTwo {
    public String lastTwo(String str) {
        if (str.length()<2){
            return str;
        }
        String last1 = str.substring(str.length()-2,str.length()-1);
        String last2 = str.substring(str.length()-1);
        return str.substring(0,str.length()-2)+last2+last1;
    }
}
