package functional2;

public class no34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }
}
