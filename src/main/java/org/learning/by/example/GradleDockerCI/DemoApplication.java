package org.learning.by.example.GradleDockerCI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoApplication {

    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    String getName() {
        return "world";
    }

    boolean run() {
        logger.info("hello " + getName());
        return true;
    }

    public static void main(String[] args) {

        logger.info("starting " + DemoApplication.class.getSimpleName());

        DemoApplication demoApplication = new DemoApplication();
        demoApplication.run();
    }
}
