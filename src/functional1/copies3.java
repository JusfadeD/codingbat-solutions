package functional1;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
    }
}
