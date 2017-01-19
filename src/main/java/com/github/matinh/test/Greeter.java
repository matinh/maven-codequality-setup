package com.github.matinh.test;

/**
 * This is the greeter.
 *
 * @author <a href="mailto:martin.hoeller@xss.co.at">Martin Hoeller</a>
 * @version $$Revision$$
 */
public class Greeter
{
    /** The name to say hello to. */
    private String name;

    private void notUsed()
    {
        System.out.printf("dead code");

        String s = null;
        // This would report an error from findbugs
//        int someInt = 3;
//        switch (someInt) {
//        case 1: System.out.printf("1");
//        case 2: System.out.printf("2");
//        case 3: System.out.printf("3");
//        }

        if (s.isEmpty()) { // NPE, not yet detected
            System.out.println("empty string!");
        }

    }

    /**
     * Greet the caller.
     */
    public void sayHello()
    {
        if (false)
            return;

        System.out.println("Hello " + (name == null ? "world" : name) + "!");
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
