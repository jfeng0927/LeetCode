/**
 *
 */
package com.javapractice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Jianyu Feng
 * https://leetcode.com/problems/anagrams/
 * Given an array of strings, return all groups of strings that are anagrams.
 * Note: All inputs will be in lower-case.
 * Update:
 * Given an array of strings, group anagrams together.
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 *   ["ate", "eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 *
 */
public class Anagrams implements Solution {
	public void test() {
		String[] a = {"tho","tin","erg","end","pug","ton","alb",
				"mes","job","ads","soy","toe","tap","sen","ape",
				"led","rig","rig","con","wac","gog","zen","hay",
				"lie","pay","kid","oaf","arc","hay","vet","sat",
				"gap","hop","ben","gem","dem","pie","eco","cub",
				"coy","pep","wot","wee"};
		String[] b = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
		String[] c = {"", ""};
		System.out.println(anagrams(a));
		System.out.println(anagrams(b));
		System.out.println(anagrams(c));
	}

	public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String cur = strs[i];
            Integer[] val = new Integer[26];
            Arrays.fill(val, 0);
            for(int j=0; j<cur.length(); j++) {
                val[cur.charAt(j)-97] ++;
            }
            String key = Arrays.toString(val);
            if(!map.containsKey(key)) {
                map.put(key, cur);
            } else {
                if(!result.contains(map.get(key))) {
                    result.add(map.get(key));
                }
                result.add(cur);
            }
        }

        return result;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str:strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }

            map.get(s).add(str);
        }

        for (List<String> list:map.values()) {
            lists.add(list);
        }

        return lists;
    }
}
