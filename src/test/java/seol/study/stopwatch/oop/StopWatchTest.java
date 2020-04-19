package seol.study.stopwatch.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StopWatchTest {
    final long SECOND = 3;
    final long MILLIS_SECOND = SECOND * 1000;

    @Test
    public void 경과시간_테스트() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(MILLIS_SECOND);
        stopWatch.end();

        Time time = stopWatch.getElapsedTime();
        long elapsedTime = time.getElapsedTime();
        long elapsedNanoTime = time.getElapsedNanoTime();
        Assert.assertTrue((elapsedTime / 1000) == SECOND);
        Assert.assertTrue((elapsedNanoTime / 1000000) == MILLIS_SECOND);
    }
}