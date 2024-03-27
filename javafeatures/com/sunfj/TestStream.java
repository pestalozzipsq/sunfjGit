import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Stream<Integer> limit = Stream.iterate(0, n -> n + 2).limit(6);
        System.out.println(limit.getClass());
        limit.forEach(System.out::println);
    }
}
