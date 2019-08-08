package jdk8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//Optional 类是一个可以为null的容器对象。Optional 类的引入很好的解决空指针异常。
public class Init {
    public static void main(String[] args) {
        Optional<Integer> isNull=Optional.ofNullable(null);
        Optional<Integer> notNull=Optional.ofNullable(10);
        System.out.println(isNull.isPresent());//判断optional是否有值,如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
        System.out.println(notNull.isPresent());

        int isNullInt=isNull.orElse(new Integer(1));
        int notNullInt=notNull.orElse(new Integer(1));
        System.out.println(isNullInt);
        System.out.println(notNullInt);

        Optional<String> optional=Optional.ofNullable("optional");
        String name=optional.map(e->"jingbao_"+e).filter(e->e.contains("jingbao")).get();
        System.out.println(name);
    }
}
