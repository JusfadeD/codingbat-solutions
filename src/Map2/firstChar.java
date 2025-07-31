package Map2;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String key = s.substring(0, 1);
            map.put(key, map.getOrDefault(key, "") + s);
        }
        return map;
    }

}
