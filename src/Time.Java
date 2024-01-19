class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        this.setTime((System.currentTimeMillis()));
    }
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(long elapsed) {
        this.setTime(elapsed);
    }

    public void setTime(long elapseTime) {
        this.hour = (elapseTime / 1000) / 60 /60 % 24;
        this.minute = (elapseTime / 1000) / 60 % 60;
        this.second = (elapseTime / 1000) % 60;
    }
    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

}

