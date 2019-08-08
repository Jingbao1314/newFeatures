package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        int[] data = {4,12,1,3,5,7,9};
        Arrays.parallelSort(data);
        System.out.println(Arrays.toString(data));

        Files.list(Paths.get("/home/jingbao/桌面/java/newFeatures/src/main" +
                "/java/main")).filter(Files::isRegularFile).forEach(System
                .out::println);
    }
}
