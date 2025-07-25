package string1;

public class firstTwo {
    public String firstTwo(String str) {
        if(str.length()<2){
            return str;
        }
        else{
            String firstTwo = str.substring(0,2);
            return firstTwo;
        }
    }
}
