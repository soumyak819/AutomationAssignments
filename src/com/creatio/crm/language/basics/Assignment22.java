package com.creatio.crm.language.basics;

public class Assignment22 {

	public String longestCommonPrefix(String[] strs)
	{
		if (strs == null || strs.length == 0) {
        return "";
    }
    
    String prefix = strs[0];
    
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    
    return prefix;
}

public static void main(String[] args) {
	Assignment22 solution = new Assignment22();
    
    String[] strs1 = {"flower", "flow", "flight"};
    System.out.println("Output: " + solution.longestCommonPrefix(strs1));
    
    String[] strs2 = {"dog", "racecar", "car"};
    System.out.println("Output: " + solution.longestCommonPrefix(strs2));
}
}