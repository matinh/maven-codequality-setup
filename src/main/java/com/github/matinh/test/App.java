package com.github.matinh.test;

/**
 * Hello world!
 *
 */
public class App
{
    /** The name to say hello to. */
    private String name;

    /**
     * Greet the caller.
     */
    private void sayHello()
    {

        System.out.println("Hello " + (name == null ? "world" : name) + "!");
    }

    private void setName(String name)
    {
        this.name = name;
    }

    /**
     * Main method to execute the test-application.
     * @param args arguments to the executable.
     */
    public static void main(String[] args)
    {
        final App app = new App();
        app.setName("Martin");
        app.sayHello();
        app.setName("Lisi");
        app.sayHello();
    }
}
