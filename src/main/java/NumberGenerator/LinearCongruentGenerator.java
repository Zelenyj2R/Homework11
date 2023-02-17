package NumberGenerator;

import java.util.stream.Collectors;
import java.util.stream.Stream;
class LinearCongruentGenerator {
    public static Stream<Long> getRandomNumberGenerator(long a, int c, long m, long seed, int end) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(end);
    }
}
