package seol.study.stopwatch.pp;

import org.junit.Assert;
import org.junit.Test;

public class StopWatchTest {
    final long SECOND = 3;
    final long MILLIS_SECOND = SECOND * 1000;
    
    @Test
    public void 경과시간_테스트() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime = System.currentTimeMillis();
        Thread.sleep(MILLIS_SECOND);
        stopWatch.endTime = System.currentTimeMillis();

        long elapsedTime = stopWatch.getElapsedTime();
        Assert.assertTrue(elapsedTime / 1000 == SECOND);
    }

    @Test
    public void 경과시간_나노초_테스트() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startNanoTime = System.nanoTime();
        Thread.sleep(MILLIS_SECOND);
        stopWatch.endNanoTime = System.nanoTime();

        long elapsedTime = stopWatch.getElapsedNanoTime();
        Assert.assertTrue(elapsedTime / 1000000 == MILLIS_SECOND);
    }
}