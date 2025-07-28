package ap1;

public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);

        if (nameCompare < 0) return -1;
        if (nameCompare > 0) return 1;

        if (aId < bId) return -1;
        if (aId > bId) return 1;

        return 0;
    }
}
