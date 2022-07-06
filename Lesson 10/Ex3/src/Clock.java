class Clock {
    private int hours;
    private int minutes;

    public Clock() {
        this(12, 0);
    }

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void next() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 13) {
                hours = 1;
            }
        }
    }

    void display() {
        System.out.printf("%02d:%02d%n", this.hours, this.minutes);
    }
}