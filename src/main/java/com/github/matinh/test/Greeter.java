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

    /**
     * Greet the caller.
     */
    public void sayHello()
    {
        System.out.println("Hello " + (name == null ? "world" : name) + "!");
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
