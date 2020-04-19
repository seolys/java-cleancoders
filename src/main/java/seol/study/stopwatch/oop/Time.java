package seol.study.stopwatch.oop;

public class Time {
    private long elapsedTime;
    public Time(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public long getElapsedTime() {
        return (long) (elapsedTime / Math.pow(10, 6));
    }
    public long getElapsedNanoTime() {
        return elapsedTime;
    }

}
