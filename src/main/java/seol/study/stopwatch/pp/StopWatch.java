package seol.study.stopwatch.pp;

public class StopWatch {
    public long startTime;
    public long endTime;
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // 나노초 요건이 들어왔을때 변수 및 로직 추가
    public long startNanoTime;
    public long endNanoTime;
    public long getElapsedNanoTime() {
        return endNanoTime - startNanoTime;
    }

    // 경과시간에 대한 요건이 생길때마다 변수를 추가..
}
