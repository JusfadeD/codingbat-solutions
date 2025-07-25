package string1;

public class lastChars {
    public String lastChars(String a, String b) {
        if(a==""&&b==""){
            return "@@";
        }
        else if (a==""){
            return '@'+b.substring(b.length()-1);
        }
        else if (b==""){
            return a.substring(0,1)+'@';
        }
        else
            return a.substring(0,1)+b.substring(b.length()-1);
    }
}
