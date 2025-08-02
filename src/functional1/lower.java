package functional1;

public class lower {
    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }

}
