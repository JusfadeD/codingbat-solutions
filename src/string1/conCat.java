package string1;

public class conCat {
    public String conCat(String a, String b) {
        if (a==""){
            return b;
        }
        else if (b==""){
            return a;
        }
        else if ((a.substring(a.length()-1)).equals(b.substring(0,1))){
            return a+b.substring(1);
        }
        else return a+b;
    }
}
