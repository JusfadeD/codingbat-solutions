package logic2;

public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBig = Math.min(goal / 5, big);
        int remaining = goal - (maxBig * 5);
        return remaining <= small;
    }

}
