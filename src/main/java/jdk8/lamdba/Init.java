package jdk8.lamdba;

import java.util.*;

/**
 * @author jijngbao
 * @date 19-6-8
 */
public class Init {
    public static void main(String[] args) {
        MathOperation  sum=(x,y)-> x +y;
        System.out.println(sum.operation(1,2));

        String hello="Hello ";
        SayHello sayHello=(userName)-> {int id=7721;
            System.out.println(hello+userName+id);};
        sayHello.sayHello("啊么么");

    }
    interface MathOperation {
        int operation(int a, int b);
    }
    interface SayHello{
        void sayHello(String userName);
    }
}
