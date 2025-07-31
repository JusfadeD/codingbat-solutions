package Map2;

public class firstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> swapped = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);

            if (swapped.contains(key)) {
                continue;
            }

            if (map.containsKey(key)) {
                int j = map.get(key);
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
                swapped.add(key);
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }
}
