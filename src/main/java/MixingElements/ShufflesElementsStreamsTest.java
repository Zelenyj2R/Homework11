package MixingElements;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static MixingElements.ShufflesElementsStreams.zip;

public class ShufflesElementsStreamsTest {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(13, 21, 39, 43, 55);
        Stream<Integer> stream2 = Stream.of(11, 97, 73, 62);
        Stream<Integer> zip = zip(stream1, stream2);
        System.out.println(zip.collect(Collectors.toList()));

    }
}
