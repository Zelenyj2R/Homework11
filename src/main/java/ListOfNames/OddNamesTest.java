package ListOfNames;

import java.util.List;

public class OddNamesTest {
    public static List<String> names = List.of("Ivan", "Hans", "Peter", "Elke", "Magda", "Kristian");

    public static void main(String[] args) {
        System.out.println(OddNames.OddNamesOutput(names));
    }
}
