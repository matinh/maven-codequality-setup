package com.github.matinh.test;

/**
 * @author Petri Kainulainen
 */
public class Buggy {

    private void foo()
    {
        System.out.println("never called");
    }

    public static void main(String[] arguments) {
//        String foo = null;
//        System.out.println(foo.length());
    }
}
