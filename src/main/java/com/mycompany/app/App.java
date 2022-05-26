package com.mycompany.app;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int len = input.length();
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for(int i =0; i< len; i++) {
        	char tempChar = input.charAt(i);
        	String temp = Character.toString(tempChar);
        	if(map.containsKey(temp)) {
        		int value = map.get(temp);
        		map.put(temp, ++value);
        	} else {
        		map.put(temp, 1);
        	}
        }
        
        for(String letter : map.keySet()) {
        	System.out.printf("%s = %d \n", letter, map.get(letter));
        }
    }
}
