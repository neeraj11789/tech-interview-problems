package java8.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples {

    private static final String JAVA_EXTENSION = ".java";

    /**
     * Example of Lambda functions without using it
     */
    public void exampleWithoutLambda() {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(JAVA_EXTENSION);
            }
        };

        File dir = new File("/tmp");
        final File[] files = dir.listFiles(fileFilter);

        for (File f : files){
            System.out.println(f);
        }
    }


    /**
     * Example of Lambda functions replacing the code with lambda
     */
    public void exampleWithLambda(){
        FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(JAVA_EXTENSION);
        File dir = new File("/tmp");
        final File[] files = dir.listFiles(fileFilter);

        for (File f : files){
            System.out.println(f);
        }
    }

    /**
     * Comparator Example without Lambda
     */
    public void comparatorExampleWithoutLambda(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        List<String> strings = Arrays.asList("**", "***", "****", "*");
        Collections.sort(strings);
        for (String s: strings){
            System.out.println(s);
        }
    }

    /**
     * Comparator Example With Lambda
     */
    public void comparatorExampleWithLambda(){
        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        List<String> strings = Arrays.asList("**", "***", "****", "*");
        Collections.sort(strings);
        for (String s: strings){
            System.out.println(s);
        }
    }

}
