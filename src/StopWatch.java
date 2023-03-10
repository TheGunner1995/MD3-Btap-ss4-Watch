public class StopWatch {
    long startTime, stopTime;
    public long start(){
        return startTime=System.currentTimeMillis();
    }
    public long end(){
        return stopTime=System.currentTimeMillis();
    }
    public  long time(){
        return stopTime - startTime;
    }
}
