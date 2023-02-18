package ListOfNames;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNames {
    public static String OddNamesOutput(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
