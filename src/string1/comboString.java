package string1;

public class comboString {
    public String comboString(String a, String b) {
        String longer="";
        String shorter="";
        if (a.length()>b.length()){
            longer= a;
            shorter=b;
        }
        else{
            longer =b;
            shorter =a;
        }
        return shorter+longer+shorter;
    }
}
