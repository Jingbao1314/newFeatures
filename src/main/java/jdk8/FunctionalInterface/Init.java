package jdk8.FunctionalInterface;

import javax.management.ObjectName;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author jijngbao
 * @date 19-6-9
 */
public class Init {
    public static void main(String[] args) {
        /**
         * 先看看如何创建它们
         */
        Function<String,String> function1 = item -> item +"返回值";

        Consumer<String> function2 = iterm -> {System.out.println(iterm);};//lambda语句，使用大括号，没有return关键字，表示没有返回值

        Predicate<Object> function3 = Init::isNull;

        Supplier<String> function4 = () -> new String("");

        System.out.println(function3.or((e)->{
            if (e.toString().equals("")){
                return true;
            }else {
                return false;
            }
        }).test(""));



        /**
         * 再看看怎么使用
         * demo释义：
         * 1、创建一个String类型的集合
         * 2、将集合中的所有元素的末尾追加字符串'1'
         * 3、选出长度大于2的字符串
         * 4、遍历输出所有元素
         */
//        List<String> list = Arrays.asList("zhangsan","lisi","wangwu","xiaoming","zhaoliu");
//
//        list.stream()
//                .map(value -> value + "1") //传入的是一个Function函数式接口
//                .filter(value -> value.length() > 2) //传入的是一个Predicate函数式接口
//                .forEach(value -> System.out.println(value)); //传入的是一个Consumer函数式接口
    }

    public static boolean isNull(Object ele){
        if (ele==null){
            return true;
        }
        return false;

    }
}

