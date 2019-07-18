package com.company.Demo11;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }
    private static void findChar(String line){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);

            }else{
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
    }
}
