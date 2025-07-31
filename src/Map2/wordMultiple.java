package Map2;

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
            map.put(s, countMap.get(s) >= 2);
        }

        return map;
    }

}
