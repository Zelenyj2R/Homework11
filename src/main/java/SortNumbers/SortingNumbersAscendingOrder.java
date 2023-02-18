package SortNumbers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingNumbersAscendingOrder {
    public static String sortingNumbersMethod(String[] arr) {

        return Stream.of(arr)
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));

    }
}

