package array1;

public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sum1=0;
        int sum2=0;
        for(int i=0; i<a.length; i++){
            sum1+=a[i];
        }
        for(int j=0; j<b.length; j++){
            sum2+=b[j];
        }
        if(sum1>=sum2){
            return a;
        }
        else
            return b;

    }
}
