package hashmap_exercises;

import java.lang.reflect.Array;
import java.util.*;

/**
 * LeetCode 49 - Group Anagrams
 *
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * Example:
 * Input:  ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]] (order may vary)
 */
public class GroupAnagrams {

    /**
     * Groups the given words into lists of anagrams.
     *
     * @param strs array of input strings
     * @return a list of groups, where each group is a list of anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: implement
        // Typical approach:
        // - For each string, sort its characters to get a "canonical form"
        // - Use a Map<String, List<String>>: canonicalForm -> list of words
        // - Return the map's values as the result
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>()); // create new list if key not present
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

