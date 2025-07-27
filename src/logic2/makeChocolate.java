package logic2;

public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigUsed = Math.min(goal / 5, big);
        int remaining = goal - (maxBigUsed * 5);
        if (remaining <= small) {
            return remaining;
        } else {
            return -1;
        }
    }
}
