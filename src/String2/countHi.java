package String2;

public class countHi {
    public int countHi(String str) {
        int count = 0;
        if(str.length()>=2){
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
                    count+=1;
                }}
        }
        return count;
    }
}
