package warmup1;

public class intMax {
    public int intMax(int a, int b, int c) {
        if (Math.max(a,b)>Math.max(b,c)){
            return Math.max(a,b);
        }
        else{return Math.max(b,c);}
    }
}
