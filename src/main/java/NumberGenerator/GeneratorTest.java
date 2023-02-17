package NumberGenerator;

import java.util.stream.Collectors;

public class GeneratorTest {
    public static void main(String[] args) {
        System.out.println(LinearCongruentGenerator.
                getRandomNumberGenerator(25214903917L, 11, (long) Math.pow(2, 48), 0, 10)
                .collect(Collectors.toList()));
    }
}
