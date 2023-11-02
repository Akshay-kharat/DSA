package com.arkdsa.search;

import java.util.HashSet;

public class LongestStringNoRepChar {
	
	 public static int lengthOfLongestSubstring(String s) {
		 HashSet<Character> seen=new HashSet<>();
		 int left=0,right=0,max=0;
		 while (right<s.length()) {
			 char c=s.charAt(right);
			if (seen.add(c)) {
				max=Math.max(max,right-left+1);
				right++;
			}else {
				while (s.charAt(left)!=c) {
					seen.remove(s.charAt(left));
					left++;
				}seen.remove(c);
				left++;
			}
		}
		 
		return max;
	        
	    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcdaba"));;
	}

}
