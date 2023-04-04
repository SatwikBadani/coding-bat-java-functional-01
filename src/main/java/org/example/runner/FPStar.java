package org.example.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 */
public class FPStar {

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(str -> str + "*");
        return strings;
    }
}
