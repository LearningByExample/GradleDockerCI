package org.learning.by.example.GradleDockerCI;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DemoApplicationTest {

    @Test
    public void run() throws Exception {
        DemoApplication demoApplication = new DemoApplication();
        assertThat(demoApplication.run(), is(true));
    }

    @Test
    public void getName() throws Exception {
        DemoApplication demoApplication = new DemoApplication();
        assertThat(demoApplication.getName(), is("world"));
    }

    @Test
    public void main() throws Exception {
        DemoApplication.main(new String[]{});
    }

}