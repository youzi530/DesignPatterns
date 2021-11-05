package tw.D02_lazyMan;

import org.junit.Test;

public class LazyManTest {

    LazyMan lazyMan = new LazyMan();

    @Test
    public void when_the_condition_is_singlethread_two_results_are_output() {
        new Thread(() -> {
            lazyMan.getInstance();
        }).start();
    }

    @Test
    public void when_the_condition_is_multithreaded_multiple_results_are_output() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                lazyMan.getInstance();
            }).start();
        }
    }
}
