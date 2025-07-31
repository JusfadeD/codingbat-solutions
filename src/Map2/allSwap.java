package Map2;

public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);

            if (map.containsKey(key)) {
                int j = map.get(key);
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }
}
