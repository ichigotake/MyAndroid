package net.ichigotake.myandroid.library;

import net.ichigotake.myandroid.library.test.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
public class CatTest {

    @Test
    public void testGreet() {
        assertThat("Hello".equals(new Cat().greet()));
    }
}
