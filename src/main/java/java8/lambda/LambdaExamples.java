package java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaExamples {

    private static final String JAVA_EXTENSION = ".java";

    /**
     * Example of Lambda functions without using it
     */
    public void ExampleWithoutLambda() {
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
    public void ExampleWithLambda(){
        FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(JAVA_EXTENSION);
        File dir = new File("/tmp");
        final File[] files = dir.listFiles(fileFilter);

        for (File f : files){
            System.out.println(f);
        }
    }
}
