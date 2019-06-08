package jdk8.methodReference;

/**
 * @author jijngbao
 * @date 19-6-8
 */
public class Init {
    public static void main(String[] args) {
        int sum=sum(SumMethod::sum,1,2);
        System.out.println(sum);
    }

    public static int sum(Sum sum,int x,int y){
        return sum.sum(x,y);
    }
}


interface Sum{
    int sum(int x,int y);
}


class SumMethod{
    public static int sum(int x, int y){
        return x+y;
    }
}