package ca.rasul.dropwizardtest;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * @author Nasir Rasul {@literal nasir@rasul.ca}
 */
public class HelloApplication extends Application<HelloConfiguration> {
    /**
     * When the application runs, this is called after the {@link Bundle}s are run. Override it to add
     * providers, resources, etc. for your application.
     *
     * @param configuration the parsed {@link Configuration} object
     * @param environment   the application's {@link Environment}
     * @throws Exception if something goes wrong
     */
    @Override
    public void run(HelloConfiguration configuration, Environment environment) throws Exception {

    }

    public static void main(String args[]) throws Exception {
        new HelloApplication().run(args);
    }
}
