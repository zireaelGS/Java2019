package Chapter17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("");

        // count occurrences of each letter in a Stream<String> sorted by letter
        Map<String, Long> letterCounts =
                Files.lines(Paths.get("Chapter2Paragraph.txt"))
                        .map(line -> line.replaceAll("\\s*\\p{P}*", ""))
                        .flatMap(line -> pattern.splitAsStream(line))
                        .collect(Collectors.groupingBy(String::toLowerCase,
                                TreeMap::new, Collectors.counting()));

// display the letters and a value of their occurrences
        letterCounts.entrySet()
                .forEach(letter -> System.out.printf(
                        "%13s: %d%n", letter.getKey(), letter.getValue()));
    }
}

