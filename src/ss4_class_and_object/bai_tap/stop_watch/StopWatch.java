package ss4_ClassAndObject.bai_tap.StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0;
        }
        return endTime - startTime;
    }
}
