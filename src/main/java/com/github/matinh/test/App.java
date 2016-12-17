package com.github.matinh.test;

/**
 * Hello world!
 *
 */
public final class App
{
    private App()
    {
    }

    /**
     * Main method to execute the test-application.
     * @param args arguments to the executable.
     */
    public static void main(String[] args)
    {
        final Greeter app = new Greeter();
        app.setName("Martin");
        app.sayHello();
        app.setName("Lisi");
        app.sayHello();
    }
}
