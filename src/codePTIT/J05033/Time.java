package codePTIT.J05033;


class Time implements Comparable<Time>{
    private int hour, min, sec, time;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.time = hour * 3600 + min * 60 + sec;
    }

    @Override
    public int compareTo(Time o) {
        return time > o.time ? 1 : -1;
    }

    @Override
    public String toString() {
        return hour + " " + min + " " + sec;
    }
}
