package SortingNames;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListNames {
    public static String SortNames (List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).toString();

    }
}
