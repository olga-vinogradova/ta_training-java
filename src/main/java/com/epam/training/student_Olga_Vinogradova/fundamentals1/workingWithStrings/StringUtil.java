package com.epam.training.student_Olga_Vinogradova.fundamentals1.workingWithStrings;

import java.util.*;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (sample == null || words == null || words.length == 0) {
            return 0;
        }

        int count = 0;
        for (String word : words) {
            if (word.trim().equalsIgnoreCase(sample.trim())) {
                count++;
            }
        }

        return count;
    }

    public static String[] splitWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return null;
        }

        StringTokenizer tokenizer = new StringTokenizer(text, ",.;: ?!");
        List<String> wordList = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().trim();
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }

        if (wordList.isEmpty()) {
            return null;
        }

        return wordList.toArray(new String[0]);
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.isEmpty()) return null;
        if (!pathWin(path) && !pathUnix(path)) return null;
        if ((pathWin(path) && toWin) || (pathUnix(path) && !toWin)) return path;

        String pathCommon;
        if (toWin) {
            pathCommon = convertPathToWindows(path);
        } else {
            pathCommon = convertPathToUnix(path);
        }
        return pathCommon;
    }

    public static boolean pathWin(String path) {
        String regWin = "(C:\\\\)?([\\w\\s\\\\.]*)";
        return Pattern.matches(regWin, path);
    }

    public static boolean pathUnix(String path) {
        String regUnix = "(~|/)?([\\w./\\s]*)";
        return Pattern.matches(regUnix, path);
    }

    private static String convertPathToUnix(String path) {
        if (path.startsWith("C:\\User")) {
            path = path.replace("C:\\User", "~");
        }
        if (path.startsWith("C:\\")) {
            path = path.replace("C:\\", "/");
        }
        return path.replace("\\", "/");
    }

    private static String convertPathToWindows(String path) {
        if (path.startsWith("~")) {
            path = path.replace("~", "C:\\User");
        }
        if (path.startsWith("/")) {
            path = path.replaceFirst("/", "C:\\\\");
        }
        return path.replace("/", "\\");
    }
    public static String joinWords(String[] words) {
        if (words == null || words.length == 0) {
            return null;
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (String word : words) {
            if (!word.isEmpty()) {
                joiner.add(word);
            }
        }

        if (joiner.length() == 0) {
            return null;
        }

        return "[" + joiner.toString() + "]";
    }





    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}
