package ss4_oop.bai3;

public class StopWatch {
    private int starTime;
    private int endTime;
    public StopWatch(int starTime,int endTime){
        this.endTime = endTime;
        this.starTime = starTime;
    }

    public int getStarTime() {
        return starTime;
    }

    public void setStarTime(int starTime) {
        this.starTime = starTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public  int starTime(int starTime){
        return starTime;
    }
    public  int endTime(int endTime){
        return endTime;
    }
    public int getElapsedTime(int starTime,int endTime){
        return this.endTime - this.starTime;
    };
}
