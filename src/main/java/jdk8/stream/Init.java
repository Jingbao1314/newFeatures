package jdk8.stream;

import java.util.*;
import java.util.function.Function;

/**
 * @author jijngbao
 * @date 19-6-8
 */
public class Init {
    public static void main(String[] args) {






        List<String>strings = Arrays.asList("abcd", "", "bc", "efg", "abcd",
                "", "jkl");
// 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> {
            if(string.length()>0){
                return true;
            }else {
                return false;
            }
        }).count();
        System.out.println(count);

    }
}
