package recursion1;

public class bunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies==0) return 0;
        return bunnyEars(bunnies-1) +2;
    }
}
