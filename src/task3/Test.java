package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do et dolore magna aliqua. " +
                "Iaculis nunc sed augue lacus viverra vitae congue eu consequat. " +
                "Faucibus purus in massa tempor nec feugiat nisl pretium. " +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames. " +
                "Semper auctor neque vitae tempus quam.";

        List<String> sentences = Stream.of(text.split("\\.")).toList();
        List<String> words = Stream.of(text.replace(",", "").replace(".", "").split(" ")).toList();
        char[] chars = text.replaceAll(" ", "").toCharArray();
       sentences.forEach(System.out::println);
       words.forEach(System.out::println);
        for (char c : chars) {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("Sentences count " + sentences.size());
        System.out.println("Words count " + words.size());
        System.out.println("Chars count " + chars.length);
    }
}
