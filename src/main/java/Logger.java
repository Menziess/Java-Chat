
/**
 * Simple class for logging timestamps.
 */
public class Logger {

    private long previousTimeStamp = -1;
    private boolean showLog = false;

    public Logger(boolean showLog) {
        this.showLog = showLog;
    }

    public long start(){
        previousTimeStamp = System.nanoTime();
        return previousTimeStamp;
    };

    public long time()
    {
        long thisTimeStamp = System.nanoTime();
        long duration = thisTimeStamp - previousTimeStamp;

        if (showLog)
            System.out.println("DONE, in " + duration/1e6 + " ms");

        previousTimeStamp = thisTimeStamp;

        return previousTimeStamp;
    }
}