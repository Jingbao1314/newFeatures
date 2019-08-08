package jdk8.optional;

import java.util.Optional;

/**
 * @author jijngbao
 * @date 19-7-19
 */
public class Init {
    public static void main(String args[]){


        Optional<Student> student=Optional.ofNullable(new Student("xxx",15));
    }


    public void test(){
        Init init = new Init();
        Integer value1 = null;
        Integer value2 = null;

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.ofNullable(value2);
        System.out.println(init.sum(a,b));
    }
    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.orElse(new Integer(0));
        return value1 + value2;
    }
}
