package seol.study.stopwatch.oop;

public class StopWatch {
    private long startTime;
    private long endTime;
    public void start() {
        startTime = System.nanoTime();
    }
    public void end() {
        endTime = System.nanoTime();
    }
    public Time getElapsedTime() {
        return new Time(endTime - startTime);
    }

}
